-- Write your code here:
SELECT retailer.name AS ret_name,
       retailer.hq_location AS ret_location,
       supplier.name AS sup_name
FROM top_retailers AS retailer, suppliers AS supplier
WHERE retailer.annual_revenue_billions > 100;