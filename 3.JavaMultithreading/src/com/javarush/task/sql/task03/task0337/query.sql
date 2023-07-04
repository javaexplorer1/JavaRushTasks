-- Write your code here:
SELECT authors.*
FROM authors JOIN books
ON authors.id = books.author_id
WHERE books.author_id != 7 AND books.title != 'War and Peace';
