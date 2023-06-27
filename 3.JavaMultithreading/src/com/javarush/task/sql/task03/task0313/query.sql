-- Write your code here:
SELECT retailers.name AS ret_name,
       sup.name AS sup_name,
       sup.country AS sup_country
FROM top_retailers AS retailers, suppliers AS sup;