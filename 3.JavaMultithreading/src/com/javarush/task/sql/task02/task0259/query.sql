-- Write your code here:
SELECT position, GROUP_CONCAT(name SEPARATOR ';')
FROM employee
GROUP BY position
HAVING position LIKE '%developer%';