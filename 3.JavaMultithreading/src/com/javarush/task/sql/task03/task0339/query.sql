-- Write your code here:
SELECT authors.*
FROM authors
WHERE authors.id IN
      (SELECT author_id.books FROM books WHERE books.genre = 'fantasy');