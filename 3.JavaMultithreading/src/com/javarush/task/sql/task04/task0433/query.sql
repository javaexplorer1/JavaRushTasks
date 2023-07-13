-- Write your code here:
SELECT YEAR(date), MONTH(date), DAYOFMONTH(date), COUNT(*)
FROM event
WHERE user_id = 3 AND type = 'SOLVE_TASK' AND status = 'OK'
GROUP BY YEAR(date), MONTH(date), DAYOFMONTH(date);