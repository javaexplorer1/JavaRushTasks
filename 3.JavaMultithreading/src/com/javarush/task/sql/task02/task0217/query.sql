-- Write your code here:
SELECT
CASE
WHEN euro > 5 THEN 'best'
WHEN euro = 5 THEN 'good'
ELSE 'bad'
END
FROM cars WHERE prod_year > 2020 ORDER BY price LIMIT 5;