-- Write your code here:
SELECT author.full_name AS full_name, COUNT(DISTINCT publisher.name) AS publishers
FROM author LEFT JOIN book ON author.id = book.author_id
                JOIN publisher ON book.publisher_id = publisher.id
GROUP BY author.full_name;
