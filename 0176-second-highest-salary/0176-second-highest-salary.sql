# Write your MySQL query statement beloe
select MAX(salary) as SecondHighestSalary  from Employee where salary < (select Max(salary) from Employee);