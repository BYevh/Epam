CREATE TABLE IF NOT EXISTS Person_email
(
    Id    int,
    Email varchar(255)
);

TRUNCATE TABLE Person_email;

INSERT INTO Person_email (Id, Email)
VALUES ('1', 'a@b.com'),
       ('2', 'c@d.com'),
       ('3', 'a@b.com');

SELECT DISTINCT a.Email
FROM person_email a
         JOIN person_email b
              ON (a.Email = b.Email)
WHERE a.Id <> b.Id