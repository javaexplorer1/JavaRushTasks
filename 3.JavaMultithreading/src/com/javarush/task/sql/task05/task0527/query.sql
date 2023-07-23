-- Write your code here:
SELECT DISTINCT book.title
FROM book JOIN author ON book.author_id = author.id
WHERE author.full_name = 'Edgar Allan Poe';
