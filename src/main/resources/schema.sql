DROP DATABASE IF EXISTS whyNot_db;
CREATE DATABASE whyNot_db DEFAULT CHARACTER SET utf8mb4;

USE whyNot_db;

CREATE TABLE IF NOT EXISTS `activity` (
  `activityId` INT NOT NULL,
  `activityName` VARCHAR(50) NOT NULL,
  `isInside` TINYINT NOT NULL,
  `isSingle` TINYINT NOT NULL,
  `isCardio` TINYINT NOT NULL,
  `useEquip` TINYINT NOT NULL,
  PRIMARY KEY (activityId)
)ENGINE=InnoDB DEFAULT CHARACTER SET = utf8mb4;

INSERT INTO activity(activityId, activityName, isInside, isSingle, isCardio, useEquip) 
VALUES (1, "런닝", 0, 1, 1, 0),
(2, "축구", 0, 0, 1, 0),
(3, "스케이트보드", 0, 1, 1, 1),
(4, "테니스", 0, 0, 1, 1),
(5, "등산", 0, 1, 0, 0),
(6, "요가", 0, 0, 0, 0),
(7, "골프", 0, 1, 0, 1),
(8, "패러글라이딩", 0, 0, 0, 1),
(9, "수영", 1, 1, 1, 0),
(10, "댄스 스포츠", 1, 0, 1, 0),
(11, "피트니스", 1, 1, 1, 1),
(12, "폴 댄스", 1, 0, 1, 1),
(13, "발레", 1, 1, 0, 0),
(14, "복싱", 1, 0, 0, 0),
(15, "클라이밍", 1, 1, 0, 1),
(16, "크로스핏", 1, 0, 0, 1);

CREATE TABLE IF NOT EXISTS `user` (
	`userId` VARCHAR(50) NOT NULL,
    `password` VARCHAR(50) NOT NULL,
	`nickname` VARCHAR(50) NOT NULL,
	`phoneNumber` INT(11) NOT NULL,
	`gender` TINYINT NOT NULL,
	`location` VARCHAR(50) NOT NULL,  
	`profileImg` TEXT NOT NULL,
    `type` INT NOT NULL,
    PRIMARY KEY(userId)
);

INSERT INTO user(userId, password, nickname, phoneNumber, gender, location, profileImg, type) 
VALUES ("ssafy", "1234", "김싸피", "01012341234", 0, "대전시 유성구 봉명동", "https://avatars.githubusercontent.com/u/99077953?v=4", 5),
("ssafy2", "1234", "박싸피", "01043214321", 0, "서울특별시 광진구 광장동", "https://avatars.githubusercontent.com/u/139411481?v=4", 2),
("ssafy3", "1234", "남궁싸피", "01022223333", 0, "대전시 유성구 궁동", "https://avatars.githubusercontent.com/u/139411346?v=4", 3),
("ssafy4", "1234", "독고싸피", "01077775555", 0, "대전시 유성구 봉명동", "https://avatars.githubusercontent.com/u/128347576?v=4", 12);

CREATE TABLE IF NOT EXISTS `crew` (
    `crewId` INT AUTO_INCREMENT,
    `crewName` VARCHAR(50) NOT NULL,
    `content` TEXT NOT NULL,
    `schedule` VARCHAR(50) NOT NULL,
    `tag` INT NOT NULL,
    `location` VARCHAR(50) NOT NULL,  
    `regDate` TIMESTAMP DEFAULT now(),
    `memberNum` INT NOT NULL,
    `leader` VARCHAR(50) NOT NULL,
    CONSTRAINT `tag_fk` FOREIGN KEY (`tag`) REFERENCES `activity`(`activityId`),
    PRIMARY KEY(crewId)
) ENGINE=InnoDB;

INSERT INTO crew(crewName, content, schedule, tag, location, memberNum, leader) 
VALUES ("대롱대롱 요가크루", "초보자도 함께할 수 있는 요가 크루", "2023-06-15", 4, "대전시 유성구 궁동", 6, "ssafy3"),
("으쌰으쌰 런닝크루", "갑천을 따라 달려요", "2023-11-30", 4, "대전시 유성구 봉명동", 5, "ssafy4");

CREATE TABLE IF NOT EXISTS `user_crew` (
  `userId` VARCHAR(50) NOT NULL,
  `crewId` INT NOT NULL,
  CONSTRAINT `userId_fk` FOREIGN KEY (`userId`) REFERENCES `user`(`userId`),
  CONSTRAINT `crewId_fk` FOREIGN KEY (`crewId`) REFERENCES `crew`(`crewId`)
)ENGINE=InnoDB DEFAULT CHARACTER SET = utf8mb4;

INSERT INTO user_crew(userId, crewId) 
VALUES ("ssafy3", 1), ("ssafy4", 2);

CREATE TABLE IF NOT EXISTS `reply` (
  `crewId` INT NOT NULL,
  `replyId` INT AUTO_INCREMENT,
  `replyWriter` VARCHAR(50) NOT NULL,
  `replyContent` TEXT NOT NULL,
  CONSTRAINT `replyWriter_fk` FOREIGN KEY (`replyWriter`) REFERENCES `user`(`userId`),
  PRIMARY KEY(replyId)
)ENGINE=InnoDB DEFAULT CHARACTER SET = utf8mb4;

INSERT INTO reply(crewId, replyWriter, replyContent) 
VALUES (1, "ssafy", "요가를 처음 하는데 괜찮을까요?"), (1, "ssafy3", "고럼요 초보자를 위해서 속도 천천히 맞춰드립니다!");

commit;

SELECT * FROM user;
SELECT * FROM crew;
SELECT * FROM user_crew;
SELECT * FROM reply;
SELECT * FROM activity;