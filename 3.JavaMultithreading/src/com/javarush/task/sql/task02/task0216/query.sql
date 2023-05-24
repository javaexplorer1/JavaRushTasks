-- Write your code here:
SELECT
CASE position
    WHEN 'backend developer' THEN 'yes'
    WHEN 'frontend developer' THEN 'yes'
    ELSE 'no'
END
FROM employee
WHERE department = 'cool devs';
