-- Write your code here:
SELECT * FROM event
         WHERE DATE(date_time) BETWEEN DATE_SUB(CURDATE(), INTERVAL 14 DAY) AND CURDATE();