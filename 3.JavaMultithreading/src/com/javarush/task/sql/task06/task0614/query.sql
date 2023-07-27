-- Write your code here:
UPDATE employee, (SELECT employee.id FROM employee JOIN task ON employee.id = task.employee_id
    WHERE task.exp_date < '2022-10-01') AS id_to_update SET
    salary = salary + 1000
WHERE employee.id = id_to_update.id;

