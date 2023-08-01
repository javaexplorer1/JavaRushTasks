-- Write your code here:
ALTER TABLE employee
    ADD INDEX position_index (position),
    ADD INDEX salary_index (salary);