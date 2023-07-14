-- Write your code here:
SELECT CONCAT(city, '-', LENGTH(city))
FROM cities
ORDER BY LENGTH(city)
LIMIT 3;