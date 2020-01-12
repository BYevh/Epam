CREATE SCHEMA IF NOT EXISTS crud;

USE crud;

CREATE TABLE IF NOT EXISTS skills
(
    id         INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name_skill varchar(255) NOT NULL
);
TRUNCATE TABLE skills;

CREATE TABLE IF NOT EXISTS developers
(
    id          INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
    first_name  varchar(255) NOT NULL,
    second_name varchar(255) NOT NULL,
    account     varchar(255) NOT NULL
);
TRUNCATE TABLE developers;

CREATE TABLE IF NOT EXISTS skills_of_each_developers
(
    id           INT(255) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_developer INT(255) NOT NULL,
    first_skill  INT(255),
    second_skill INT(255),
    third_skill  INT(255),
    fourth_skill INT(255),
    fifth_skill  INT(255),
    FOREIGN KEY (id_developer) REFERENCES developers (id)
);
TRUNCATE TABLE skills_of_each_developers;
