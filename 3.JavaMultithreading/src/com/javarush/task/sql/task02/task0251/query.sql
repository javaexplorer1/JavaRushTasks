-- Write your code here:
SELECT department, positiont, COUNT(*) AS total
FROM employee
GROUP BY department, position
HAVING total = 1 OR position = 'manager'
LIMIT 2 OFFSET 1;