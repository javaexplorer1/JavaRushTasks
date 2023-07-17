-- Write your code here:
SELECT name
FROM part
WHERE name LIKE '%Slope%' AND name NOT LIKE '%45°%';