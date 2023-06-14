-- Write your code here:
SELECT IF(YEAR(date_of_birth) < 2000, 'yes', 'no') AS experienced, MONTH(date_of_birth) AS month_of_birth FROM employee