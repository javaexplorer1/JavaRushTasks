-- Write your code here:
SELECT id, name, age, smth, salary, department, IF(salary <= 500, 1000, 0) FROM employee
WHERE id > 5 LIMIT 10;