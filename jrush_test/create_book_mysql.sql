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
			
			('���������','Book 1','Ivanov','999','2000',false),
	        ('���������','Book 2','Ivanov','999','2000',false),
			('���������','Book 3','Ivanov','999','2000',false),
			('���������','Book 4','Ivanov','999','2000',false),
	        ('���������','Book 5','Ivanov','999','2000',false),
			
			('������','Book 1','ϸ������','999-999','2000',false),
	        ('������','Book 2','ϸ������','999-999','2000',false),
			('������','Book 3','ϸ������','999-999','2000',false),
			('������','Book 4','ϸ������','999-999','2000',false),
	        ('������','Book 5','ϸ������','999-999','2000',false);
			
			
INSERT INTO `book`  (title,description,author,print_year)
	VALUES			
			('����� � ���','�����','�.�. �������','2000'),
	        ('�����','�����','�.�. �����������','2001'),
			('1984','�����','�. ������','2002'),
			('������','�����','�. �������','2003'),
	        ('��� ��������','�����','�.�. ������','2004'),
			('����������� ���������� � �������','�����','�. �������','2005'),
			('���������� ���','�����','�. ��������','2006'),
			('451 ������ �� ����������','�����','�. ��������','2007');