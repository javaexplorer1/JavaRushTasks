-- Write your code here:
SELECT customers.city,
       orders.store_id
FROM customers RIGHT JOIN orders
ON customers.customer_id = orders.customer_id
WHERE orders.order_status = 'SHIPPED' AND orders.total_cost > 100;