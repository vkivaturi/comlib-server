CREATE TABLE useraccess (
  id int NOT NULL AUTO_INCREMENT,
  userId int NOT NULL,
  communityId int NOT NULL,
  isActive boolean DEFAULT false,
  accessStartDate varchar(10) DEFAULT NULL,
  accessEndDate varchar(10) DEFAULT NULL,
  accessProviderUserId int NOT NULL, 
  lastUpdatedTS timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  lastUpdatedUser varchar(100) DEFAULT NULL,
  PRIMARY KEY (id),
  index(userId, communityId, isActive)
);