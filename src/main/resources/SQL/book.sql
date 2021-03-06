CREATE TABLE book (
  id int NOT NULL AUTO_INCREMENT,
  title varchar(100) NOT NULL,
  author varchar(100) DEFAULT NULL,
  imageUrl varchar(500) DEFAULT NULL,
  description varchar(500) DEFAULT NULL,
  isbn varchar(50) DEFAULT NULL,  
  pages int DEFAULT NULL,
  language varchar(20) DEFAULT NULL,
  readingAgeGroup varchar(10) DEFAULT NULL,
  amazonUrl varchar(500) DEFAULT NULL,
  flipkartUrl varchar(500) DEFAULT NULL,
  publisher varchar(100) DEFAULT NULL,
  totalRatingsCount int DEFAULT NULL,
  totalRatingsValue int DEFAULT NULL,
  lastUpdatedTS timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  lastUpdatedUser varchar(100) DEFAULT NULL,
  PRIMARY KEY (id),
  index(title, author)
);