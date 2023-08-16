-- Write your code here:
SELECT film_directors.*
FROM film_directors RIGHT JOIN (SELECT director_id, title FROM films WHERE year > 1990) AS film
ON film_directors.id = film.director_id
WHERE film_directors.location = 'USA'
LIMIT 5;