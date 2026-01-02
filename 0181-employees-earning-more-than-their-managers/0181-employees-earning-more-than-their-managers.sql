# Write your MySQL query statement below

SELECT name as Employee 
FROM Employee x
WHERE x.salary >
 (SELECT salary FROM Employee y
  WHERE x.managerId = y.id
 )