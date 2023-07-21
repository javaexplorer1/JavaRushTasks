-- Write your code here:
UPDATE part SET
name = CASE WHEN id = 92909 THEN 'Technic, Steering Wheel Hub 3 Pin Round' ELSE name END,
name = CASE WHEN id = 19916 THEN 'Minifigure, Headgear Helmet SW Darth Vader Type 2 Top' ELSE name END
WHERE id IN (92909, 19916);

UPDATE author SET full_name = '  Lewis' WHERE full_name = 'C.     ********S. Lewis';