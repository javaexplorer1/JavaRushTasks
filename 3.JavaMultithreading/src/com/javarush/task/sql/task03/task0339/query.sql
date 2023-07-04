-- Write your code here:
SELECT authors.*
FROM authors
WHERE authors.id IN
      (SELECT books.author_id FROM books WHERE books.genre = 'fantasy');

