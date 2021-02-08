CREATE TABLE IF NOT EXISTS skill (
    id INT AUTO_INCREMENT PRIMARY KEY,
    skillName VARCHAR(255) NOT NULL,
    skillType INTEGER NOT NULL
);

CREATE TABLE IF NOT EXISTS skill_part (
    id INT AUTO_INCREMENT PRIMARY KEY,
    task VARCHAR(255) NOT NULL,
    is_done BOOLEAN NOT NULL DEFAULT FALSE,
    skill_id INT NOT NULL,
    FOREIGN KEY(skill_id) REFERENCES skill(id)
);

CREATE TABLE IF NOT EXISTS project (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS project_task (
    id INT AUTO_INCREMENT PRIMARY KEY,
    content VARCHAR(255) NOT NULL,
    is_done BOOLEAN NOT NULL DEFAULT FALSE,
    project_id INT NOT NULL,
    FOREIGN KEY(project_id) REFERENCES project(id)
);

-- INSERT INTO skill (skillName, skillType) VALUES ('Java', '1');
-- INSERT INTO skill_part (task, is_done, skill_id) VALUES ('baeldung', false, 1);
-- INSERT INTO skill_part (task, is_done, skill_id) VALUES ('Working with NIO', false, 1);
