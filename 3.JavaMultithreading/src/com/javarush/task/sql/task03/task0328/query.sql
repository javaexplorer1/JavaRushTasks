-- Write your code here:
SELECT customers.phone AS cust_phone,
       orders.order_date,
       orders.total_cost,
       orders.store_id
FROM customers RIGHT JOIN orders
ON customers.customer_id = orders.customer_id
WHERE customers.city = 'New York' AND orders.order_status = 'PROCESSING';