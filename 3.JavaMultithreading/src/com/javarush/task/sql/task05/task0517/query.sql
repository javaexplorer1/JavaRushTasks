-- Write your code here:
SELECT released, COUNT(*)
FROM lego_set
GROUP BY released;