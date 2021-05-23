CREATE TABLE user (
  id int NOT NULL AUTO_INCREMENT,
  email varchar(100) NOT NULL,
  name varchar(100) DEFAULT NULL,
  password varchar(100) DEFAULT NULL,
  isActive boolean DEFAULT NULL,
  lastUpdatedTS timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  lastUpdatedUser varchar(100) DEFAULT NULL,
  PRIMARY KEY (id),
  index(email, name)
);