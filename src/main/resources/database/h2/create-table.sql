DROP TABLE USER;
CREATE TABLE user(id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
                  name VARCHAR(36) NOT NULL,
                  number INT NULL,
                  createTime TIMESTAMP AS CURRENT_TIMESTAMP NOT NULL,
                  birth TIMESTAMP NULL);