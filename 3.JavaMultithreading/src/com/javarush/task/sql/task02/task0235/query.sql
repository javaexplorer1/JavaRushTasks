-- Write your code here:
SELECT YEAR(date_of_birth) AS year_of_birth, COUNT(*)
FROM employee WHERE position LIKE '%developer%' GROUP BY YEAR(date_of_birth);