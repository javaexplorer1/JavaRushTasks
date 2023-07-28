-- Write your code here:
UPDATE employee
SET position = 'fullstack developer',
    salary   = 5000
WHERE position LIKE '%developer%';