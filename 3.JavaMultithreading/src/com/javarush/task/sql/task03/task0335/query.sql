-- Write your code here:
SELECT author.country AS author_country,
       COUNT(book.book_id) AS book_count
FROM authors AS author JOIN books AS book
ON author.id = book.author_id
WHERE book.genre = 'novel'
GROUP BY author.country
HAVING COUNT(book.book_id);