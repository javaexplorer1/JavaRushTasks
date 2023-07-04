-- Write your code here:
SELECT a.last_name AS author,
       b.title AS book_title,
       b.copies_sold_millions AS books_sold
FROM authors AS a RIGHT JOIN books AS b
ON a.author_id = b.author_id
WHERE b.copies_sold_millions > 50;