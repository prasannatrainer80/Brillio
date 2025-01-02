select GENDER, count(*) from Agent
GROUP BY GENDER;

select job,count(*) from Emp
Group by Job
having count(*) > 1;

select job,sum(sal) from Emp
group by job
having sum(sal) > 5000;


select job,count(*) from Emp
where job in ('CLERK','MANAGER','ANALYST')
Group by Job
having count(*) > 1
order by job;

