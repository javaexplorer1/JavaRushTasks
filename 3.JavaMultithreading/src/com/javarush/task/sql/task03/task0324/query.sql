-- Write your code here:
SELECT c.customer_id,
       o.order_id
FROM customers AS c LEFT JOIN orders AS o
ON c.customer_id = o.customer_id
WHERE o.shipped_date IS NULL;