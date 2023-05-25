-- Write your code here:
SELECT IF(IFNULL(euro, 'good') = 'good', 'good', 'bad') FROM cars;
-- SELECT department, IF(IFNULL(department, 'good') = 'good', 'good', 'bad') FROM employee;