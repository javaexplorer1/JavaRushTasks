-- Write your code here:
SELECT a.sex AS author_sex,
       a.country AS author_country,
       b.copies_sold_millions AS books_sold
FROM authors AS a JOIN books AS b
ON a.author_id = b.author_id
WHERE b.copies_sold_millions > 10
GROUP BY author_sex, author_country, books_sold
ORDER BY books_sold DESC;