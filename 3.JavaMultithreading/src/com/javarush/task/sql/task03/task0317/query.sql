-- Write your code here:
SELECT * FROM top_retailers JOIN suppliers
    ON top_retailers.ret_location = suppliers.sup_country;