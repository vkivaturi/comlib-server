CREATE TABLE community (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(100) NOT NULL,
  locality varchar(100) DEFAULT NULL,
  city varchar(100) DEFAULT NULL,
  pinCode varchar(6) DEFAULT NULL,
  adminUser varchar(100) DEFAULT NULL,  
  lastUpdatedTS timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  lastUpdatedUser varchar(100) DEFAULT NULL,
  PRIMARY KEY (id),
  index(name, city, adminUser)
);