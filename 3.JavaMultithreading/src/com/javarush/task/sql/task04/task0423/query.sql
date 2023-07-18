-- Write your code here:
SELECT name, position FROM employee WHERE DAYNAME(date_birth) = 'понедельник';