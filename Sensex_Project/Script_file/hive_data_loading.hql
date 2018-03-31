use sensex87_db;
LOAD DATA  INPATH '/PigOut87' INTO TABLE sensex_records PARTITION (typeof_trading ='short term');

