select adddate(
adddate(last_day(curdate()),INTERVAL -1 MONTH)
, INTERVAL 1 DAY);

select dayofweek(
adddate(
adddate(last_day(curdate()),INTERVAL -1 MONTH)
, INTERVAL 1 DAY));

select adddate( 
adddate(
adddate(last_day(curdate()),INTERVAL -1 MONTH)
, INTERVAL 1 DAY)
, INTERVAL 6-dayofweek(
adddate(
adddate(last_day(curdate()),INTERVAL -1 MONTH)
, INTERVAL 1 DAY)) DAY) 'First Friday';

