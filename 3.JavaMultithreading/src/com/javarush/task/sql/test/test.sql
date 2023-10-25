
# For test in HRlink
SELECT last_name FROM driver AS d JOIN (SELECT driver_id FROM car_driver AS cd JOIN car AS c ON cd.car_id = c.id WHERE brand='Toyota' GROUP BY driver_id HAVING COUNT(brand) >= 2) AS toyota_drivers ON d.id=toyota_drivers.driver_id;
