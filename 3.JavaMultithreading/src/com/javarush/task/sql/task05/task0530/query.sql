-- Write your code here:
USE space;
SELECT name,
       YEAR(discovery_date) AS d_year,
       MONTHNAME(discovery_date) AS d_month,
       DAYOFWEEK(discovery_date) AS d_day
FROM object;