-- Write your code here:
SELECT name, SUM(price) FROM cars GROUP BY name HAVING SUM(price) > 200000;