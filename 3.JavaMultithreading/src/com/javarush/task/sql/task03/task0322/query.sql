-- Write your code here:
SELECT c.customer_id,
       c.email,
       o.order_id,
       o.order_status
FROM customers AS c JOIN orders AS o
ON c.customer_id = o.customer_id
WHERE o.order_status = 'PAID' OR o.order_status = 'PROCESSING';