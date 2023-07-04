-- Write your code here:
WITH tempTable(averageDOB) AS (SELECT AVG(year_born) FROM film_directors)
SELECT id,full_name, year_borm FROM film_directors, tempTable
WHERE film_directors.year_borm < tempTable.averageDOB;