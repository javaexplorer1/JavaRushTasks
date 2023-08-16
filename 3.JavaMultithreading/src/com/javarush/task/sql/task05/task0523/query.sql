-- Write your code here:
SELECT number, ROUND(inventory * 1.01) AS with_spare_parts
FROM lego_set;