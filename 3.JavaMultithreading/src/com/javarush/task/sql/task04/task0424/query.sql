-- Write your code here:
SELECT name, position FROM employee WHERE DAYOFYEAR(date_birth) <= 200;