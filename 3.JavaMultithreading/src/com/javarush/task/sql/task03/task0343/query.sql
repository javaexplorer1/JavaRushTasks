-- Write your code here:
SELECT full_name
FROM film_directors LEFT JOIN (SELECT title FROM films WHERE genre = 'comedy') AS f
ON films_director.id = f.director_id;
