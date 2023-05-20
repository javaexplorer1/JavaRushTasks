-- Write your code here:
SELECT
    CASE
        WHEN experience < 1 THEN 'junior'
        WHEN experience < 3 THEN 'middle'
        WHEN experience < 5 THEN 'senior'
FROM developer;
