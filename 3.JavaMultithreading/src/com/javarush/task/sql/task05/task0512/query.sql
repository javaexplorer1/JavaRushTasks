-- Write your code here:
SELECT name, released, inventory
FROM lego_set
ORDER BY YEAR(released) ASC, inventory ASC;