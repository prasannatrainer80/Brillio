-- Change the database to brillio
use brillio;

-- Display all tables in brillio database 
show tables;

-- Display Info about Emp table 

desc Emp;

-- Display all records from Emp table 

select * from Emp;

-- Display Empno, Ename, job, sal from Emp table 

select Empno, Ename, JOb, Sal
from Emp;

-- Where clause : used to display filterd data

-- Display info whose empno is 7839

select * from Emp where empno = 7839;
select * from Emp where job='Manager';

-- between...and : 

select * from Emp where 
sal between 1000 and 3000;

select * from Emp where 
sal NOT BETWEEN 1000 AND 3000;

-- IN Cluase : Used to display multiple values of particular field

select * from Emp where 
ename in('KING','SCOTT','FORD');

select * from Emp Where
JOB IN ('CLERK','MANAGER','ANALYST');

-- LIKE Operator : Used to display data w.r.t. Wildcards

select * from Emp where ename like 'S%';

-- Display All names ends with 'S'

select * from Emp where ename like '%S';

select * from Emp where ename like 'J___S';

-- Order By : Used to display data w.r.t. Specific 
-- field(s) in ascending or desceding

select Empno, Ename, Job, Sal from Emp 
order By Ename;

select Empno, Ename, Job, Sal from Emp
order By Job,Ename;

select Empno, Ename, Job, Sal from Emp
order By Job,Ename DESC;
