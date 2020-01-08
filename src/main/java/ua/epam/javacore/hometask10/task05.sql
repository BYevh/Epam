CREATE TABLE IF NOT EXISTS Customers
(
    Id   int,
    Name varchar(255)
);
CREATE TABLE IF NOT EXISTS  Orders
(
    Id         int,
    CustomerId int
);
TRUNCATE TABLE Customers;
INSERT INTO Customers (Id, Name)
VALUES ('1', 'Joe'),
       ('2', 'Henry'),
       ('3', 'Sam'),
       ('4', 'Max');
TRUNCATE TABLE  Orders;
INSERT INTO Orders (Id, CustomerId)
VALUES ('1', '3'),
       ('2', '1');

SELECT Name
FROM Customers
WHERE Id NOT IN
      (SELECT CustomerId FROM Orders);