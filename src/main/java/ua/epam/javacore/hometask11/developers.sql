CREATE TABLE IF NOT EXISTS developers
(
    id          INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
    first_name  varchar(255) NOT NULL,
    second_name varchar(255) NOT NULL,
    salary      INT(255)     NOT NULL
);

INSERT INTO developers (first_name, second_name, salary)
VALUES ('vasia', 'pupkin', 1000),
       ('pusha', 'dudkin', 10000);