-- Write your code here:
SELECT author.last_name AS author,
       author.country AS author_country,
       book.genre AS book_genre
FROM authors AS author LEFT JOIN books AS book
ON author.id = book.author_id
WHERE book.genre = 'fantasy'
GROUP BY author.last_name, author.country, book.genre
ORDER BY author.country ASC
LIMIT 5;