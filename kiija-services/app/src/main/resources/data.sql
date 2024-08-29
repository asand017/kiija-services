CREATE TABLE IF NOT EXISTS subjects (
    id INT PRIMARY KEY,
    name VARCHAR(255)
    -- set_id INT,
    -- FOREIGN KEY (set_id) REFERENCES 
);

CREATE TABLE IF NOT EXISTS topics (
    id INT PRIMARY KEY,
    subject_id INT,
    name VARCHAR(255),
    FOREIGN KEY (subject_id) REFERENCES subjects(id)
);

INSERT INTO subjects (id, name) VALUES (1, 'Arithmetic');
INSERT INTO subjects (id, name) VALUES (2, 'Algebra');

INSERT INTO topics (id, subject_id, name) VALUES (1, 1, 'Addition');
INSERT INTO topics (id, subject_id, name) VALUES (2, 1, 'Subtraction');
INSERT INTO topics (id, subject_id, name) VALUES (3, 1, 'Multiplication');
INSERT INTO topics (id, subject_id, name) VALUES (4, 1, 'Division');