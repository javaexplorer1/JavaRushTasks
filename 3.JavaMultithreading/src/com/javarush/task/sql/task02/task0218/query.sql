-- Write your code here:
SELECT
CASE
    WHEN IFNULL(euro, 6) > 5 THEN 'best'
    WHEN IFNULL(euro, 6) = 5 THEN 'good'
    ELSE 'bad'
END
FROM cars;