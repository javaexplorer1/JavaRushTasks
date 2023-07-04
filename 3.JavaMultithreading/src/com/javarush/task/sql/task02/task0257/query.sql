-- Write your code here:
SELECT name, AVG(price), SUM(price) FROM cars GROUP BY name HAVING AVG(price) > 100000;