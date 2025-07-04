SELECT e.name
FROM employee e
JOIN (
    SELECT department_id, AVG(salary) AS avg_salary
    FROM employee
    GROUP BY department_id
) d ON e.department_id = d.department_id
WHERE e.salary > d.avg_salary;

select * from employee;

select name,salary,department_id from employee e where salary =
(select max(salary) from employee where department_id=
e.department_id);

select * from employee 

SELECT d.dept_id, d.dept_name
FROM departments d
JOIN (SELECT department_id FROM employee
GROUP BY department_id
HAVING AVG(salary) > (SELECT AVG(salary) FROM employee)
) high_avg ON d.dept_id = high_avg.department_id;


SELECT d.dept_name
FROM departments d
JOIN employee e ON d.dept_id = e.department_id
GROUP BY d.dept_id, d.dept_name
HAVING MIN(e.salary) > 50000;


SELECT department_id
FROM employee
GROUP BY department_id
HAVING COUNT(*) = (
SELECT MAX(emp_count)
FROM (
SELECT COUNT(*) AS emp_count
FROM employee
GROUP BY department_id) AS dept_counts);


SELECT *
FROM employee e
WHERE hire_date::DATE >= CURRENT_DATE - INTERVAL '3 years'
AND salary > ( SELECT AVG(salary)
FROM employee
WHERE department_id = e.department_id);



SELECT department_id, COUNT(*) as employee_count
FROM employee
GROUP BY department_id
HAVING COUNT(*) = (
    SELECT MAX(dept_count)
    FROM (
        SELECT COUNT(*) as dept_count
        FROM employee
        GROUP BY department_id
    ) sub
);

select * from employee;
SELECT department_id, COUNT(*) as employee_count
FROM employee
GROUP BY department_id
ORDER BY employee_count desc 
limit 1











