-- Write your code here:
SELECT retailer.ret_name,
       retailer.ret_revenue,
       supplier.sup_name,
       supplier.sup_revenue
FROM top_retailers AS retailer JOIN suppliers AS supplier
ON retailer.ret_revenue = supplier.sup_revenue
WHERE supplier.sup_revenue > 50;