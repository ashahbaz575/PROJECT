create database if not exists sqoopexp;
use sqoopexp;
drop table if exists sensex_table;
create  table  sensex_table(sensex_id double, sensex_name varchar(30),sensex_trading varchar(20), location varchar(30), opening_bal double, closing_bal double, fluctuation_rate double)
