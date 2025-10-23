# Write your MySQL query statement below

-- WITH cte AS
-- (SELECT employee_id FROM Employees
--  UNION
--  SELECT employee_id FROM Salaries
-- )

-- SELECT c.employee_id 
-- FROM cte c
-- LEFT JOIN Employees e
-- ON e.employee_id = c.employee_id
-- LEFT JOIN Salaries s
-- ON s.employee_id = c.employee_id
-- WHERE e.name IS NULL OR s.salary IS NULL
-- ORDER BY c.employee_id ASC;

SELECT e.employee_id
FROM Employees e 
LEFT JOIN Salaries s
ON e.employee_id = s.employee_id
WHERE s.salary IS NULL
UNION
SELECT s.employee_id
FROM Salaries s
LEFT JOIN Employees e
ON s.employee_id = e.employee_id
WHERE e.name IS NULL
ORDER BY employee_id ASC;
