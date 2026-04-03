# Write your MySQL query statement below
select emp.name as Employee 
from Employee emp
join Employee mgr
on mgr.id=emp.managerId 
where emp.salary>mgr.salary;