-- Write your code here:
SELECT g.id AS gyms_id,
       g.name AS gyms_name,
       c.name AS customers_name,
       c.email AS customers_email
FROM gyms g, customers c;