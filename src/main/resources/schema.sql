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
    CONSTRAINT `leader_fk` FOREIGN KEY (`leader`) REFERENCES `user`(`userId`),
    PRIMARY KEY(crewId)
) ENGINE=InnoDB;

INSERT INTO crew(crewName, content, schedule, tag, location, memberNum, leader) 
VALUES 
("달려달려 런닝크루", "갑천을 따라 달려요", "2023-11-30", 1, "대전시 유성구 봉명동", 5, "ssafy4"),
("달려라 슛돌이", "슛돌이가 꿈이었던 청년들과 함께하는 축구크루", "2023-05-11", 2, "대전시" , 10, "ssafy"),
("겨울보드", "겨울에만 활동하는 스케이트보드 크루입니다.", "2024-01-25", 3, "대전시", 8, "ssafy"),
("테테레테테테니스", "테니스 파트너를 찾고 계시다면 바로 여기에요", "2023-10-10", 4, "대전시", 6, "ssafy"),
("영차영차 등산크루", "매주 주말 오전에 모입니다.", "2023-11-18", 5, "대전시", 20, "ssafy"),
("대롱대롱 요가크루", "초보자도 함께할 수 있는 요가 크루", "2023-11-20", 6, "대전시 유성구 궁동", 4, "ssafy"),
("욜로족의 골프 투어", "젊을 때 신나게 살아요", "2023-12-12", 7, "대전시", 3, "ssafy"),
("날다람쥐", "하늘을 날아보셨나요? 저희와 함께해요", "2023-09-20", 8, "대전시", 5, "ssafy"),
("어푸어푸", "중급 이상의 실력을 가지신 분들 모집합니다", "2023-11-17", 9, "대전시", 10, "ssafy"),
("들썩들썩 댄스스포츠", "댄스 스포츠! 당신도 할 수 있습니다!", "2023-12-24", 10, "대전시", 24, "ssafy"),
("하체 맛있다", "같이 쇠질하실 분 구해요", "2023-11-24", 11, "대전시", 2, "ssafy"),
("폴 인 럽", "진입장벽이 높은 만큼 더 재밌어요", "2023-04-28", 12, "대전시", 4, "ssafy"),
("도도도도 발레크루", "유연성과 근력을 동시에 기를 수 있는 발레크루입니다", "2023-07-11", 13, "대전시", 7, "ssafy"),
("강해지고싶나?", "줄넘기부터 빡세게 운동하실 분", "2023-12-12", 14, "대전시", 5, "ssafy"),
("클라이밍조아", "초보자 환영해요. 함께 해요!", "2023-11-11", 15, "대전시", 10, "ssafy"),
("으쌰으쌰 크로스핏", "체력을 기르고 싶다면 역시 크로스핏, 크루원 모집합니다", "2023-12-30", 16, "대전시", 12, "ssafy");


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

CREATE TABLE IF NOT EXISTS `article`(
	`articleId` INT NOT NULL PRIMARY KEY,
    `articleTitle` VARCHAR(50) NOT NULL,
    `articleContent` TEXT NOT NULL,
    `articleThumbnail` TEXT NOT NULL,
    `articleUrl` TEXT NOT NULL
)ENGINE=InnoDB DEFAULT CHARACTER SET = utf8mb4;

INSERT INTO article VALUES
(1, "초간단! 전신 스트레칭 끝판왕 BEST 5", "운동 전, 10분으로 끝내는 스트레칭", "https://i.ytimg.com/vi/2LyDkE7sDec/mqdefault.jpg","https://youtu.be/2LyDkE7sDec?si=J1lt56fDyF6jU8Hn"),
(2, "운동을 못 정해서 고민이라고? 딱 정해드림!", "아직도 어떤 운동을 할지 고민이라면 클릭!", "https://cdn.univ20.com/wp-content/uploads/2017/01/bb57547a28613e673e38faa794bd1aca-7.png", "https://univ20.com/59464"),
(3, "잘못알고 있는 운동 상식", "열심히 운동을 하고 있지만 이상하게 더 피곤하고, 건강이 나빠지는 것 같은 느낌이 든다면?", "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FPA2PE%2FbtqGUgtQ0ZV%2Fz3hc6sQ7h2XeXUKBuZIff1%2Fimg.jpg", "https://gjffusdk1.tistory.com/4245"),
(4, "전신 다이어트 유산소운동 [홈트레이닝]", "점점 추워지는 날씨, 집에서 한발짝도 나가기 싫다면? 정답은 홈트!", "https://i.ytimg.com/vi/3VouSaW_LPw/mqdefault.jpg", "https://youtu.be/3VouSaW_LPw?si=LoHfX7o818Z2bbB1");

commit;

SELECT * FROM user;
SELECT * FROM crew;
SELECT * FROM user_crew;
SELECT * FROM reply;
SELECT * FROM activity;
SELECT * FROM article;
SELECT * FROM crew;
