-- Write your code here:
SELECT prod_year, COUNT(*) AS car_count FROM cars GROUP BY prod_year;