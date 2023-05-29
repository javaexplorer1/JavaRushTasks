-- Write your code here:
SELECT prod_year, COUNT(*) FROM cars WHERE name = 'Blue Car' GROUP BY prod_year;