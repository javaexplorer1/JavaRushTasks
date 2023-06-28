-- Write your code here:
SELECT c.zip_code,
       o.order_id
FROM customers AS c LEFT JOIN orders AS o
ON c.customer_id = o.customer_id
WHERE o.shipped_date IS NOT NULL AND o.store_id = 27;