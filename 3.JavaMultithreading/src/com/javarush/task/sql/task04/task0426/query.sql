-- Write your code here:
SELECT YEAR(date), MONTH(date), DAY(date), COUNT(total)
FROM data
GROUP BY YEAR(date), MONTH(date), DAY(date);