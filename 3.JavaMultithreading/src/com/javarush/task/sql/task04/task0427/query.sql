-- Write your code here:
SELECT * FROM event WHERE DATEDIFF(CURDATE(), DATE(date_time)) < 20;