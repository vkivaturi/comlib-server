CREATE TABLE userbook (
  id int NOT NULL AUTO_INCREMENT,
  userId int NOT NULL,
  communityId int NOT NULL,
  bookId int NOT null,
  isActive boolean DEFAULT false,
  isAvailable boolean DEFAULT false,
  lendeeUserId int NOT NULL, 
  lendStartDate varchar(10) DEFAULT NULL,
  lastUpdatedTS timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  lastUpdatedUser varchar(100) DEFAULT NULL,
  PRIMARY KEY (id),
  index(userId, communityId, bookId)
);