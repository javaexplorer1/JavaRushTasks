-- Write your code here:
SELECT COUNT(*) AS count_auto FROM cars GROUP BY name HAVING count_auto > 1;