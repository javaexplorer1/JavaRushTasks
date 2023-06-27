-- Write your code here:
SELECT customers.last_name AS surname,
       orders.order_id
FROM customers LEFT JOIN orders
ON customers.customer_id = orders.customer_id;