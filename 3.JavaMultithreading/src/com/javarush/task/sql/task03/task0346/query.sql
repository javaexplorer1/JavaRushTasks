-- Write your code here:
SELECT films.*
FROM films JOIN (SELECT * FROM film_directors WHERE year_born < 1940) AS director
ON films.director_id = director.id
WHERE films.genre = 'sci-fi';