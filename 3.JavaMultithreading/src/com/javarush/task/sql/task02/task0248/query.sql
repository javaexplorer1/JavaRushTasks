-- Write your code here:
SELECT department, position, COUNT(*) AS total FROM employee HAVING total > 1 AND total < 4;