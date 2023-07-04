-- Write your code here:
SELECT gym.id, gym.name, cust.id FROM gyms AS gym, customers AS cust WHERE cust.id < 50;