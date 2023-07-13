-- Write your code here:
SELECT MONTH(date), COUNT(*) AS count_fail
FROM event
WHERE status = 'ERROR' OR status = 'FAILED'
GROUP BY MONTH(date)
ORDER BY count_fail DESC
LIMIT 1;

