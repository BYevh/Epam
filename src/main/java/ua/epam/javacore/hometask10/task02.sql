CREATE TABLE IF NOT EXISTS employee_salary
(
    Id     INT,
    Salary INT
);

TRUNCATE TABLE employee_salary;

INSERT INTO employee_salary (Id, Salary)
VALUES ('1', '100'),
       ('2', '200'),
       ('3', '300'),
       ('4', '400');

SELECT max(salary) AS SecondHighestSalary
FROM employee_salary
WHERE salary < (SELECT max(salary) FROM employee_salary);