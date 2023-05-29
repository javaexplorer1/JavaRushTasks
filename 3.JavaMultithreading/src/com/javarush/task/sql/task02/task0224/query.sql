-- Write your code here:
SELECT department, COUNT(*) FROM employee WHERE position = 'backend developer' GROUP BY department;