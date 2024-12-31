-- Write a query to display ManagerName as for job
-- For CLERK 'Anoop'
-- For SALESMAN 'Shwetha'
-- For MANAGER 'Navin'
-- For ANALYST 'Manoj'
-- For President 'No Manager'

select Empno, Ename, job, sal,
case JOB
  WHEN 'CLERK' THEN 'ANOOP'
  WHEN 'SALESMAN' THEN 'Shwetha'
  WHEN 'MANAGER' THEN 'Navin'
  WHEN 'ANALYST' THEN 'Manoj'
  WHEN 'PRESIDENT' THEN 'No Manager'
END 'Reporting Auth'
from Emp;

