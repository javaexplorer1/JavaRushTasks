-- Write your code here:
SELECT description FROM parts ORDER BY required DESC, identifier DESC, description DESC OFFSET 23;