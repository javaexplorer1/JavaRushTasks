-- Write your code here:
SELECT id, IF(salary > 1000, 'yes', 'no') FROM employee WHERE id < 5;