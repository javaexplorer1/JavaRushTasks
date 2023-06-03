-- Write your code here:
SELECT
CASE
    WHEN position = 'backend developer' THEN 'yes'
    WHEN position = 'frontend developer' THEN 'yes'
    ELSE 'no'
END
FROM employee
WHERE department = 'cool devs';
