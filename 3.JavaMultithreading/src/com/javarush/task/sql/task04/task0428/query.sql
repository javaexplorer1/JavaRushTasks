-- Write your code here:
SELECT * FROM event WHERE MONTH(date_time) = MONTH(CURDATE()) AND YEAR(date_time) = YEAR(CURDATE());