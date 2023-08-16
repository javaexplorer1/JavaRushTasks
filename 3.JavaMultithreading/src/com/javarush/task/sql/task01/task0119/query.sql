-- Write your code here:
-- SELECT * FROM employee WHERE department IN ('dev', 'qa');
SELECT * FROM employee WHERE department = 'dev' OR department = 'qa'