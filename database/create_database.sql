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
CREATE TABLE role (
	id BIGINT NOT NULL PRIMARY KEY auto_increment,
    user_id BIGINT NOT NULL,
    code VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES user(id)
);
INSERT INTO `servlet_jsp_SM`.`role` (`id`, `user_id`, `code`, `name`) VALUES ('1', '1', 'ADMIN', 'Quản Trị');
INSERT INTO `servlet_jsp_SM`.`role` (`id`, `user_id`, `code`, `name`) VALUES ('2', '2', 'User', 'Người dùng');
INSERT INTO `servlet_jsp_SM`.`role` (`id`, `user_id`, `code`, `name`) VALUES ('3', '3', 'ADMIN', 'Quản Trị');
