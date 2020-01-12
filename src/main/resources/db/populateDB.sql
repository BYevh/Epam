USE crud;


INSERT INTO skills (name_skill)
VALUES ('Java'),
       ('PHP'),
       ('C#'),
       ('C++'),
       ('Kotlin');


INSERT INTO developers (first_name, second_name, account)
VALUES ('Sergey', 'Ivanov', 'ACTIVE'),
       ('Pavel', 'Petrov', 'ACTIVE'),
       ('Yuriy', 'Luzhkov', 'BANNED');


INSERT INTO skills_of_each_developers(id_developer, first_skill, second_skill)
VALUES (1, 1, 2),
       (2, 1, 3),
       (3, 1, 5);

