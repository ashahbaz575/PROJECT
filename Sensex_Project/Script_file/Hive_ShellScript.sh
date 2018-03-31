##########  HIVE	Shell	Script ##########    
##Store the same PIG Output in a HIVE External Table with PARTITIONING enabled(with Type Of Trading)##
##Set the Environmnet##

# Creating Database & table for Sensex_logdata

hive -f hive_table_creation.hql

if [ $? -eq 0 ] 
then
echo "Table has created successfully"
else
echo "Table has not created successfully"
exit 9
fi

# Creating Data Loading Script

hive -f hive_data_loading.hql

if [ $? -eq 0 ]
then
echo "Data has been loaded in Hive"
else
echo "Data has not loaded in HIve table"
exit 10
fi
# NOTE: will be specify the valid path of <<HDFS_USER>>
