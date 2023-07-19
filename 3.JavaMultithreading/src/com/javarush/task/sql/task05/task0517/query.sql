-- Write your code here:
SELECT YEAR(released) AS released, COUNT(*)
FROM lego_set
GROUP BY YEAR(released);