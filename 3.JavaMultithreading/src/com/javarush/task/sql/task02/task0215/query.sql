-- Write your code here:
SELECT
    CASE number_of_season
    WHEN 1 THEN 'winter'
    WHEN 2 THEN 'spring'
    WHEN 3 THEN 'summer'
    WHEN 4 THEN 'autumn'
    ELSE 'unknown'
    END
FROM months;

