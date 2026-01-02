# Write your MySQL query statement below

SELECT x.name AS Employee FROM 
Employee x
INNER JOIN 
Employee y
ON x.managerId = y.id
WHERE x.salary > y.salary;