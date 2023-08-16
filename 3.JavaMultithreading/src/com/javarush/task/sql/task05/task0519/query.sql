-- Write your code here:
SELECT released, COUNT(*) AS total
FROM lego_set
WHERE number < 1000
GROUP BY released
ORDER BY total DESC;
