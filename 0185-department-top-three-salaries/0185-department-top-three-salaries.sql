# Write your MySQL query statement below
# Write your MySQL query statement below
with employee_cte as
					(
						select 
							  * , 
							  dense_rank() over (partition by departmentid order by salary desc) rn 
                        from employee
					)
select 
	  dpt.name Department, 
      emp.name Employee, 
      emp.Salary  
from employee_cte emp
join department dpt
on dpt.id = emp.departmentid
where rn  <= 3