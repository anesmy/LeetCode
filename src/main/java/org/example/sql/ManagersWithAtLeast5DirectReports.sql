SELECT e.name
FROM employee m
INNER JOIN employee e
on e.id = m.managerId
GROUP BY m.managerId
HAVING COUNT(m.managerId) >= 5