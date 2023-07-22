-- Write your code here:
USE library;
SELECT book.title
FROM book JOIN author
ON book.author_id = author.id
WHERE author.full_name LIKE 'Edgar Allan Poe';
