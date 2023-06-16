-- Write your code here:
SELECT YEAR(date_of_birth), MONTH(date_of_birth), COUNT(*) FROM employee GROUP BY YEAR(date_of_birth), MONTH(date_of_birth);