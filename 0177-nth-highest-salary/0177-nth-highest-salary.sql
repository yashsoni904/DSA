CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  DECLARE offset_val INT;

  SET offset_val = N - 1;
  RETURN (
      # Write your MySQL query statement below.
      select ifnull(
        (
            select distinct salary from Employee
            order by salary desc
            limit offset_val,1
        ),null
      ) as getNthHighestSalary
  );
END