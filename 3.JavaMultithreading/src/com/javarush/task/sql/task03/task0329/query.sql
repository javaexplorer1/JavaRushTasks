-- Write your code here:
SELECT c.customer_id,
       o.order_status
FROM customers AS c JOIN orders AS o
ON c.customer_id = o.customer_id;