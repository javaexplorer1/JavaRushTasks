-- Write your code here:
SELECT author.full_name AS full_name, IF(COUNT(*) = 0, 0, COUNT(*)) AS publishers
FROM author LEFT JOIN book ON author.id = book.author_id
                JOIN publisher ON book.publisher_id = publisher.id;
