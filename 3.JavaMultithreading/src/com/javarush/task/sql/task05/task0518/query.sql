-- Write your code here:
SELECT YEAR(released) AS released, COUNT(*) AS total
FROM lego_set
GROUP BY released
ORDER BY total DESC;