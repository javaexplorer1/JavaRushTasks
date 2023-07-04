-- Write your code here:
SELECT rating, GROUP_CONCAT(name SEPARATOR ';') FROM employee GROUP BY rating HAVING rating > 2 ORDER BY rating ASC;