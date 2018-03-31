inidata = LOAD '$PigInputPath' Using PigStorage('\t') as ($Input_Schema_Sensex_Format);
groupdata = GROUP inidata BY LOCATION;
result = foreach groupdata {orderdata= ORDER inidata BY FLUTUATION_RATE DESC;
			    limitdata = LIMIT orderdata 400;
			    GENERATE FLATTEN(limitdata);};
STORE result into '$PigOutputPath';
