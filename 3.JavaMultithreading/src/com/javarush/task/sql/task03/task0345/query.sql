-- Write your code here:
SELECT film_directors.last_name
FROM film_directors LEFT JOIN (SELECT * FROM films WHERE grossed > 100) AS film
ON film_directors.id = film.director_id
WHERE film_directors.location = 'UK';