CREATE DATABASE  IF NOT EXISTS `test`;
USE `test`;
CREATE TABLE `book` (
  `id` int  NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `author` VARCHAR(100) NOT NULL,
  `isbn` VARCHAR(20) DEFAULT NULL,
  `print_year` INT DEFAULT NULL,
  `read_already` boolean DEFAULT false,
  PRIMARY KEY (`id`)
) ;

INSERT INTO `book`  (title,description,author,isbn,print_year,read_already)
	VALUES  ('Algebra','Book 1','Ivanov','999','2000',true),
	        ('Algebra','Book 2','Ivanov','999','2000',true),
			('Algebra','Book 3','Ivanov','999','2000',true),
			('Algebra','Book 4','Ivanov','999','2000',true),
	        ('Algebra','Book 5','Ivanov','999','2000',true),
			
			('Геометрия','Book 1','Ivanov','999','2000',false),
	        ('Геометрия','Book 2','Ivanov','999','2000',false),
			('Геометрия','Book 3','Ivanov','999','2000',false),
			('Геометрия','Book 4','Ivanov','999','2000',false),
	        ('Геометрия','Book 5','Ivanov','999','2000',false),
			
			('Физика','Book 1','Пёрышкин','999-999','2000',false),
	        ('Физика','Book 2','Пёрышкин','999-999','2000',false),
			('Физика','Book 3','Пёрышкин','999-999','2000',false),
			('Физика','Book 4','Пёрышкин','999-999','2000',false),
	        ('Физика','Book 5','Пёрышкин','999-999','2000',false);
			
			
INSERT INTO `book`  (title,description,author,print_year)
	VALUES			
			('Война и мир','роман','Л.Н. Толстой','2000'),
	        ('Идиот','роман','Ф.М. Достоевский','2001'),
			('1984','роман','Д. Оруэлл','2002'),
			('Гамлет','пьеса','У. Шекспир','2003'),
	        ('Три товарища','роман','Э.М. Ремарк','2004'),
			('Понедельник начинается в субботу','роман','В. Пелевин','2005'),
			('Норвежский лес','роман','Х. Мураками','2006'),
			('451 градус по Фаренгейту','роман','Р. Брэдбери','2007');