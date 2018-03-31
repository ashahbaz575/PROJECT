#!/bin/sh
echo "+++++++++++++++++++++ Put the Excel Sheet into HDFS Path +++++++++++++++++++++"

Sourcefile="SENSEX_LOGPROCESS_USERSTORY_INPUTDATA.xlsx"

targetdir="/ExcelInput"

if [ -f $Sourcefile ]
then
hdfs dfs -test -d $targetdir
if [ $? -eq 0 ]
then
hdfs dfs -put  $Sourcefile  $targetdir
else
hdfs dfs -mkdir $targetdir
hdfs dfs -put  $Sourcefile  $targetdir
fi
if [ $? -ne 0 ]
then
echo "File Already Exist"
mapreduce
fi
else
echo "Source file not exists"
exit 3
fi
if [ $? -eq 0 ]
then
echo "Source file has been successfully placed in HDFS path"
fi


echo "+++++++++++++++++++++++++ Mapreduce Processing Started +++++++++++++++++++++++++++++"

function mapreduce
{
Outputdir="/Sensex_Out87"
file_dir="/Custome_Output/ExcelUC"  #Don't change the path
hdfs dfs -test -d $file_dir
if [ $? -eq 0 ]
then
hdfs dfs -rm -R $file_dir
fi 
yarn jar ExcelRead.jar ExcelRead $targetdir $Outputdir
if [ $? -eq 0 ]
then 
echo "Mapreduce Processing Successfull"
else
echo "Mapreduce processing failed"
exit 4
fi
echo "Output files created in HDFS path"
}

echo "+++++++++++++++++++++++++++++ Pig Processing Started ++++++++++++++++++++++++++++++++++++"

pig_out="/PigOut87"
hdfs dfs -test -d $pig_out
if [ $? -eq 0 ] 
then
hdfs dfs -rm -R $pig_out
fi
pig -param_file param.conf Sensex_script2.pig

if [ $? -ne 0 ]
then
echo "Pig Script failed"
exit 5
fi

echo "+++++++++++++++++++++++++++++++ Export Data From HDFS to Mysql ++++++++++++++++++++++++++++++"

echo "++++++++++++++++++++++++++++++++ Table Creation in mysql +++++++++++++++++++++++++++++"

mysql --user=root --password=root < sqoop_table.sql

if [ $? -eq 0 ]
then
echo "Table has been created successfully in mysql"
else
echo "Table not created successfully in mysql"
exit 6
fi

sqoop export  --options-file connectiondetail.txt --table sensex_table --export-dir $pig_out -m 1 --input-fields-terminated-by "\t"

if [ $? -eq 0 ]
then
echo "Data has successfully exported into RDBMS"
else
echo "Data has not exported into RDBMS"
exit 7
fi

echo "+++++++++++++++++++++++++++++++++ Hbase processing started +++++++++++++++++++++++++++++"

hbase shell ./hbase.txt

if [ $? -eq 0 ]
 then
echo "Habse table created with namespace"
else
echo "Table not created with their namespace"
exit 8
fi

hbase org.apache.hadoop.hbase.mapreduce.ImportTsv -Dimporttsv.columns=HBASE_ROW_KEY,CF1:sensexname,CF1:TOT,CF1:loc,CF1:OB,CF1:CB,CF1:FR Sensex_namespace:Sensex_record hdfs://localhost:8020/$pig_out/

if [ $? -eq 0 ]
then
echo "Pig Output data has successfully loaded in hbase table"
else
echo "Pig output data has not loaded into hbase table"
exit 9
fi

echo "+++++++++++++++++++++++++++++++++++++ Hive processing started ++++++++++++++++++++++++++++++++++++"

sh ./Hive_ShellScript.sh


echo "++++++++++++++++++++++++++++++++++ Processing Completed +++++++++++++++++++++++++++++++++++++++++++"

