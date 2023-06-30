-- Write your code here:
SELECT authors.year_born AS author_country
FROM authors
WHERE books.year_born <= books.date_released;