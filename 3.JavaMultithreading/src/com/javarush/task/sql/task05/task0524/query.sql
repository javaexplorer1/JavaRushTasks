-- Write your code here:
SELECT book.isbn, book.title
FROM author JOIN book
ON author.id = book.author_id
WHERE author.last_name LIKE 'S%';