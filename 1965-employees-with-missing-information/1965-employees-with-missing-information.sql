# Write your MySQL query statement below
# Write your MySQL query statement below
SELECT employee_id
FROM
(
    SELECT * 
FROM Employees 
LEFT JOIN Salaries 
USING (employee_id)

UNION ALL

SELECT * 
FROM Employees 
RIGHT JOIN Salaries 
USING (employee_id)
)
T
WHERE salary IS NULL OR name IS NULL
ORDER BY employee_id