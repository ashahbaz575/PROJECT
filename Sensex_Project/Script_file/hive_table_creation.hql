--########Creating HIVE Database AND Table Creation.hql ########


--#Creating a database ffor sensex data store:
create database if not exists sensex87_db; --data base data loading from pig output

--#Connect Database
use sensex87_db;
set hive.cli.print.current.db=true;
set hive.cli.print.header=true;

--#Creating a Table to load the data of pig output:
drop table if exists sensex_records;
create external table sensex_records(sensex_id double, sensex_name string, location string, opening_bal double, closing_bal double, fluctuation_rate double)
PARTITIONED BY (typeof_trading string)
row format delimited
fields terminated by '\t'
lines terminated by '\n'
STORED as textfile LOCATION '/user/hive/warehouse/Sensex';

