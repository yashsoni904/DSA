# Write your MySQL query statement below
select name from Employee 
where id in (
    select managerId from Employee
    group by managerId
    having count(*)>=5
)



-- select m.name from Employee e
-- join Employee m
-- on e.managerId =m.id
-- group by m.id, m.name
-- having count(*)>=5