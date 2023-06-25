-- Write your code here:
SELECT g.id,
       g.name,
       c.name,
       c.email
FROM gyms AS g, customers AS c;