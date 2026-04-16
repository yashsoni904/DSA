# Write your MySQL query state
select mgr.employee_id ,
       mgr.name,
       count(e.reports_to) as reports_count ,
       round(avg(e.age)) as average_age 

from Employees mgr inner join Employees e
on mgr.employee_id  = e.reports_to 

group by mgr.employee_id ,
       mgr.name

order by mgr.employee_id        
