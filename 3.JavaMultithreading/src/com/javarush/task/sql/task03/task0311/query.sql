-- Write your code here:
SELECT top_retailers.name AS retailer, top_retailers.hq_location AS retailer_hq, suppliers.country AS supplier_country
FROM top_retailers, suppliers;