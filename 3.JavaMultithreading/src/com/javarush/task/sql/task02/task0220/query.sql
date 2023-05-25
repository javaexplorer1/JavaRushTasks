-- Write your code here:
SELECT DISTINCT name,
                CASE
                    WHEN prod_year = 2020 THEN 'new'
                    WHEN prod_year = 2021 THEN 'newer'
                    WHEN prod_year = 2022 THEN 'even newer'
                END
FROM cars;