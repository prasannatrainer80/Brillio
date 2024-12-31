select Empno, ename, job, sal, comm from Emp;

select Empno, Ename, Job, Sal, Comm,
case 
	WHEN COMM is NULL THEN 0
	else comm 
end 'commision'
from Emp;

select Empno, Ename, Job, Sal, Comm,
case 
	WHEN COMM is NULL THEN 0
	else comm 
end 'commision',
CASE 
	WHEN COMM IS NULL THEN SAL
	ELSE SAL+COMM 
END 'TakeHome'
from Emp;
