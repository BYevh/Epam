CREATE TABLE IF NOT EXISTS courses
(
    student varchar(255),
    class   varchar(255)
);

TRUNCATE TABLE courses;

INSERT INTO courses (student, class)
VALUES ('A', 'English'),
       ('B', 'English'),
       ('C', 'Math'),
       ('D', 'Biology'),
       ('E', 'Math'),
       ('F', 'Computer '),
       ('G', 'Math'),
       ('H', 'Math'),
       ('I', 'Math');

SELECT class
FROM courses
GROUP BY class
HAVING COUNT(DISTINCT student) > 4