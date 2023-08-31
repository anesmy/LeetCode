select e.name employee
from employee e
inner join employee manager
on e.managerId = manager.id
where e.salary > manager.salary