-- Write your code here:
SELECT *
FROM film_directors
WHERE full_name LIKE (SELECT CONCAT(first_name, ' '. last_name) FROM film_directors LIMIT 1);