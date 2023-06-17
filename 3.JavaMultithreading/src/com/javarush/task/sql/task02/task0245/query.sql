-- Write your code here:
SELECT name, COUNT(*) AS count_auto FROM cars GROUP BY name HAVING count_auto > 1;