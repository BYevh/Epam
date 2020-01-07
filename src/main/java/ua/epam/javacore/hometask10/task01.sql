CREATE TABLE IF NOT EXISTS person
(
    PersonId  INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    FirstName varchar(255),
    LastName  varchar(255)
);

TRUNCATE TABLE person;

INSERT INTO person
values ('1', 'Wang', 'Allen');

CREATE TABLE IF NOT EXISTS address
(
    AddressId INT,
    PersonId  INT,
    City      varchar(255),
    State     varchar(255),
    FOREIGN KEY (PersonId) REFERENCES Person (PersonId)
);

TRUNCATE TABLE address;

INSERT INTO address
values ('1', '1', 'New York City', 'New York');

SELECT firstname, lastname, city, state
FROM person
         JOIN address ON (person.PersonId = address.PersonId);

