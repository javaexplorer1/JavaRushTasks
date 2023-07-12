-- Write your code here:
SELECT DAYNAME(date), COUNT(*) AS registration_count
FROM event
WHERE type = 'REGISTRATION'
GROUP BY DAYNAME(date)
ORDER BY registration_count DESC LIMIT 1;
