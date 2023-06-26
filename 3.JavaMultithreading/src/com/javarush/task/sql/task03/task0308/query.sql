-- Write your code here:
SELECT g.location, person.name, person.email,person.telephone FROM gyms AS g, customers AS person WHERE person.name = 'Hulk';