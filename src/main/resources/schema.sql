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
	`profileImgName` TEXT,
	`profileImgPath` TEXT,
    `type` INT NOT NULL,
    PRIMARY KEY(userId)
);

INSERT INTO user(userId, password, nickname, phoneNumber, gender, location, type) 
VALUES     ('ssafy1', '1234', '이싸피', '01012345678', 1, '서울 강남구 역삼동', 1),
    ('ssafy2', '1234', '최싸피', '01023456789', 0, '부산 해운대구 우동', 8),
    ('ssafy3', '1234', '김싸피', '01034567890', 1, '대구 중구 삼덕동', 5),
    ('ssafy4', '1234', '박싸피', '01045678901', 0, '인천 남동구 만수동', 12),
    ('ssafy5', '1234', '정싸피', '01056789012', 1, '광주 서구 화정동', 3),
    ('ssafy6', '1234', '송싸피', '01067890123', 0, '대전 중구 은행동', 14),
    ('ssafy7', '1234', '오싸피', '01078901234', 1, '울산 남구 삼산동', 6),
    ('ssafy8', '1234', '류싸피', '01089012345', 0, '세종시 도담동', 10),
    ('ssafy9', '1234', '신싸피', '01090123456', 1, '경기 수원시 장안구 정자동', 2),
    ('ssafy10', '1234', '강싸피', '01001234567', 0, '강원 춘천시 효자동', 15);
    

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
("달려라 슛돌이", "슛돌이가 꿈이었던 청년들과 함께하는 축구크루", "2023-05-11", 2, "대전시 유성구 봉명동" , 10, "ssafy7"),
("겨울보드", "겨울에만 활동하는 스케이트보드 크루입니다.", "2024-01-25", 3, "대전시 유성구 봉명동", 8, "ssafy3"),
("테테레테테테니스", "테니스 파트너를 찾고 계시다면 바로 여기에요", "2023-10-10", 4, "대전시 유성구 봉명동", 6, "ssafy3"),
("영차영차 등산크루", "매주 주말 오전에 모입니다.", "2023-11-18", 5, "대전시 유성구 봉명동", 20, "ssafy5"),
("대롱대롱 요가크루", "초보자도 함께할 수 있는 요가 크루", "2023-11-20", 6, "대전시 유성구 궁동", 4, "ssafy2"),
("욜로족의 골프 투어", "젊을 때 신나게 살아요", "2023-12-12", 7, "인천 남동구 만수동", 3, "ssafy6"),
("날다람쥐", "하늘을 날아보셨나요? 저희와 함께해요", "2023-09-20", 8, "광주 서구 화정동", 5, "ssafy7"),
("어푸어푸", "중급 이상의 실력을 가지신 분들 모집합니다", "2023-11-17", 9, "강원 춘천시 효자동", 10, "ssafy9"),
("들썩들썩 댄스스포츠", "댄스 스포츠! 당신도 할 수 있습니다!", "2023-12-24", 10, "서울 강동구 성내동", 24, "ssafy10"),
("하체 맛있다", "같이 쇠질하실 분 구해요", "2023-11-24", 11, "대전 중구 은행동", 2, "ssafy3"),
("폴 인 럽", "진입장벽이 높은 만큼 더 재밌어요", "2023-04-28", 12, "인천 남동구 만수동", 4, "ssafy1"),
("도도도도 발레크루", "유연성과 근력을 동시에 기를 수 있는 발레크루입니다", "2023-07-11", 13, "대전시 유성구 궁동", 7, "ssafy1"),
("강해지고싶나?", "줄넘기부터 빡세게 운동하실 분", "2023-12-12", 14, "대전시 유성구 궁동", 5, "ssafy3"),
("클라이밍조아", "초보자 환영해요. 함께 해요!", "2023-11-11", 15, "대전시 유성구 궁동", 10, "ssafy2"),
("으쌰으쌰 크로스핏", "체력을 기르고 싶다면 역시 크로스핏, 크루원 모집합니다", "2023-12-30", 16, "서울 강남구 역삼동", 12, "ssafy4"),
('크로스핏매니아', '즐겁게 운동하며 건강한 삶을 추구하는 크루입니다', '2023-12-01', 16, '서울 강남구 역삼동', 10, 'ssafy4'),
('헬스타그램', '같이 헬스타그램 찍으면서 운동하는 크루입니다', '2023-11-25', 11, '부산 해운대구 우동', 15, 'ssafy2'),
('런닝맨', '함께 뛰면서 건강하게 살아가는 크루입니다', '2023-11-30', 1, '대구 중구 삼덕동', 8, 'ssafy3'),
('요가여행', '요가를 즐기면서 여행하는 크루~', '2023-12-05', 6, '인천 남동구 만수동', 6, 'ssafy5'),
('골프파티', '골프를 즐기면서 다양한 이벤트를 개최하는 크루입니다', '2023-11-29', 7, '광주 서구 화정동', 12, 'ssafy9'),
('테니스 챌린지', '테니스를 사랑하는 멤버들과 함께 하는 챌린지 크루에요.', '2023-12-03', 4, '대전 중구 은행동', 8, 'ssafy1'),
('보드 파티', '눈을 가르며 신나게 놀 수 있는 크루입니다', '2023-11-28', 3, '울산 남구 삼산동', 10, 'ssafy7'),
('스카이 투어', '하늘에서 하는 투어, 기대되시죠?', '2023-12-02', 8, '세종시 도담동', 16, 'ssafy8'),
('힐링폴댄스', '음악을 느끼며 폴댄스를 통해 마음을 힐링하는 크루입니다', '2023-11-27', 12, '강원 춘천시 효자동', 10, 'ssafy10'),
('축구파티', '축구를 좋아하는 사람들끼리 모여 즐기는 크루랍니다. 어서오세요.', '2023-12-07', 2, '서울 마포구 서교동', 18, 'ssafy1'),
('등산단', '등산을 통해 체력을 강화하며 아름다운 풍경을 즐기는 크루에요. 같이 올라봐요!', '2023-12-25', 5, '대전 서구 둔산동', 9, 'ssafy6'),
('테이블테니스 대결', '테이블테니스 실력을 겨루며 재미있는 대결을 즐기는 크루입니다', '2023-12-28', 4, '울산 북구 산하동', 16, 'ssafy7'),
('수영매니아', '수영을 즐기며 물 속에서의 특별한 경험을 나누는 크루입니다', '2024-01-10', 9, '서울 강동구 성내동', 7, 'ssafy1');



CREATE TABLE IF NOT EXISTS `user_crew` (
  `userId` VARCHAR(50) NOT NULL,
  `crewId` INT NOT NULL,
  CONSTRAINT `userId_fk` FOREIGN KEY (`userId`) REFERENCES `user`(`userId`),
  CONSTRAINT `crewId_fk` FOREIGN KEY (`crewId`) REFERENCES `crew`(`crewId`)
)ENGINE=InnoDB DEFAULT CHARACTER SET = utf8mb4;

INSERT INTO user_crew(userId, crewId) 
VALUES 
  ('ssafy1', 3),
  ('ssafy2', 8),
  ('ssafy3', 15),
  ('ssafy4', 22),
  ('ssafy5', 1),
  ('ssafy6', 10),
  ('ssafy7', 27),
  ('ssafy8', 5),
  ('ssafy9', 18),
  ('ssafy10', 12),
  ('ssafy1', 17),
  ('ssafy2', 4),
  ('ssafy3', 29),
  ('ssafy4', 7),
  ('ssafy5', 21),
  ('ssafy6', 11),
  ('ssafy7', 26),
  ('ssafy8', 9),
  ('ssafy9', 16),
  ('ssafy10', 3),
  ('ssafy1', 23),
  ('ssafy2', 6),
  ('ssafy3', 19),
  ('ssafy4', 14),
  ('ssafy5', 2),
  ('ssafy6', 8),
  ('ssafy7', 25),
  ('ssafy8', 12),
  ('ssafy9', 20),
  ('ssafy10', 1);

CREATE TABLE IF NOT EXISTS `reply` (
  `crewId` INT NOT NULL,
  `replyId` INT AUTO_INCREMENT,
  `replyWriter` VARCHAR(50) NOT NULL,
  `replyContent` TEXT NOT NULL,
  CONSTRAINT `replyWriter_fk` FOREIGN KEY (`replyWriter`) REFERENCES `user`(`userId`),
  PRIMARY KEY(replyId)
)ENGINE=InnoDB DEFAULT CHARACTER SET = utf8mb4;

INSERT INTO reply(crewId, replyWriter, replyContent) 
VALUES (1, "ssafy", "요가를 처음 하는데 괜찮을까요?"), 
(1, "ssafy3", "고럼요 초보자를 위해서 속도 천천히 맞춰드립니다!"),
(2, "ssafy", "한달에 몇 번 모이시나요?");

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
