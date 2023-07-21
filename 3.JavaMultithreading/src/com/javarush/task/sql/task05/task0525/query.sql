-- Write your code here:
# SELECT author.full_name, COUNT(book.title) AS books
# FROM author JOIN book
# ON author.id = book.author_id
# GROUP BY book.author_id
# HAVING books > 1;
SELECT author.full_name, COUNT(*) AS books
FROM book
    LEFT JOIN author ON book.author_id = author.id
GROUP BY book.author_id
HAVING books > 1;


