-- Write your code here:
SELECT name, MIN(price), MAX(price) FROM cars GROUP BY name HAVING MAX(prce) < 200000;