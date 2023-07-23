-- Write your code here:
SELECT DISTINCT publisher.name AS name
FROM publisher JOIN  book ON publisher.id = book.publisher_id
               JOIN author ON publisher.id = author.id
WHERE author.full_name = 'Mark Twain';

