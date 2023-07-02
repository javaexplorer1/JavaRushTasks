-- Write your code here:
SELECT authors.*
FROM authors
WHERE authors.id NOT IN
      (SELECT books.author_id
       FROM books
       WHERE books.author_id NOT NULL OR books.genre = 'play');