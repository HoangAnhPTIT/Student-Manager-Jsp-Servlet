use servlet_jsp_SM;
CREATE TABLE user (
	id BIGINT NOT NULL PRIMARY KEY auto_increment,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    fullname VARCHAR(255) NULL,
    gender VARCHAR(255) NULL,
    age INT NULL,
    address VARCHAR(255) NULL
);

CREATE TABLE student (
	id BIGINT NOT NULL PRIMARY KEY auto_increment,
    svnam VARCHAR(255) NULL,
    user_id BIGINT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES user(id)
);

CREATE TABLE teacher (
	id BIGINT NOT NULL PRIMARY KEY auto_increment,
    thamnien int NULL,
    user_id BIGINT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES user(id)
);