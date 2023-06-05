-- Write your code here:
SELECT name AS car_name, COUNT(*) AS car_count FROM cars GROUP BY name;