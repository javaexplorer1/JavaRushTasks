-- Write your code here:
SELECT IF(position = 'manager', IF(salary > 10000, 'good', 'bad'), IF(salary > 5000, 'good', 'bad')) FROM employee WHERE city = 'London';