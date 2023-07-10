-- Write your code here:
SELECT YEAR(date), MONTH(date), DAY(date), COUNT(*) AS event_count
FROM event
GROUP BY YEAR(date), MONTH(date), DAY(date)
HAVING event_count > 5;