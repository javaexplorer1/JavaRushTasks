-- Write your code here:
SELECT YEAR(released), COUNT(*) AS total
FROM lego_set
WHERE number < 1000
GROUP BY YEAR(released)
ORDER BY total DESC;
