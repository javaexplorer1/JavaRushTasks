-- Write your code here:
SELECT top_retalers.rank AS company_rank,
       top_retailers.name AS company_name,
       suppliers.annual_revenue_billions AS supplier_revenue
FROM top_retailers, suppliers
WHERE suppliers.annual_revenue_billions > 25;
