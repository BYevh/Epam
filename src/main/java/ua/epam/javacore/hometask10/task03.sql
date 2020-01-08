CREATE TABLE IF NOT EXISTS Employee
(
    Id        int,
    Name      varchar(255),
    Salary    int,
    ManagerId int
);
TRUNCATE TABLE Employee;
INSERT INTO Employee (Id, Name, Salary, ManagerId)
values ('1', 'Joe', '70000', '3'),
       ('2', 'Henry', '80000', '4'),
       ('3', 'Sam', '60000', null),
       ('4', 'Max', '90000', null);

SELECT empl.Name, empl.Salary, manager.Name, manager.Salary
FROM Employee AS empl,
     Employee AS manager
WHERE empl.ManagerId = manager.Id
  AND empl.Salary > manager.Salary
;
