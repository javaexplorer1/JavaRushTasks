-- Write your code here:
SELECT MONTHNAME(date), COUNT(*) AS count_fail
FROM event
WHERE status = 'ERROR' OR status = 'FAILED'
GROUP BY MONTHNAME(date)
ORDER BY count_fail DESC
LIMIT 1;

