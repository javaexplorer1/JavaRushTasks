-- Write your code here:
SELECT book.publication_year, book.isbn, book.title, author.full_name AS author, publisher.name AS publisher
FROM author JOIN book
ON author.id = book.author_id
JOIN publisher
ON book.publisher_id = publisher.id;