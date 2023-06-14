-- Write your code here:
SELECT YEAR(date_of_birth), MONTH(date_of_birth) FROM employee GROUP BY YEAR(date_of_birth), MONTH(date_of_birth);