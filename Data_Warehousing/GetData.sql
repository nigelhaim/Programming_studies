-- Active: 1695291570318@@localhost@3306@labexercise1
SELECT * FROM student;

--4 

SELECT curriculum_id FROM student_overview WHERE student_id = 4

SELECT * FROM student_overview;
SELECT course_name FROM COURSE WHERE course_id = (SELECT course_code FROM course_curriculum WHERE curriculum_id = 6);
SELECT course_code FROM course_curriculum WHERE curriculum_id = 6

SELECT course_name FROM COURSE WHERE course_id = 5 OR course_id=  7 

SELECT * FROM student

SELECT * FROM curriculum;


SELECT Count(course_name) FROM course 
INNER JOIN course_curriculum ON course.course_id = course_curriculum.course_id
INNER JOIN curriculum ON course_curriculum.curriculum_id = curriculum.curriculum_id
INNER JOIN student_overview ON curriculum.curriculum_id = student_overview.curriculum_id 
INNER JOIN student ON student_overview.student_id = student.student_id 
WHERE student.student_firstname = "Taylor" AND student_lastname = "Sheesh";

 SELECT COUNT(*) FROM student WHERE student_mother_maiden_name = "Elsa H. Rodrigo";

SELECT count(*) FROM student INNER JOIN student_highschool 
ON student.student_highschool_id = student_highschool.student_highschool_id 
WHERE student_highschool.highschool_name = "International School of the National Artistic Arts University";

SELECT course_name FROM course INNER JOIN course_curriculum ON course.course_id = course_curriculum.course_id INNER JOIN curriculum ON course_curriculum.curriculum_id = curriculum.curriculum_id INNER JOIN student_overview ON curriculum.curriculum_id = student_overview.curriculum_id  INNER JOIN student ON student_overview.student_id = student.student_id  WHERE student.student_firstname = "Taylor" AND student_lastname = "Sheesh";

SELECT student_firstname, student_highschool_grade FROM student;


SELECT student_overview.student_id, student.student_firstname from student_overview
INNER JOIN student ON student_overview. student_id = student.student_id
INNER JOIN curriculum ON student_overview.curriculum_id = curriculum.curriculum_id
LEFT JOIN class ON class.class_code = curriculum.class_code
INNER JOIN course_curriculum ON course_curriculum.curriculum_id = curriculum.curriculum_id
INNER JOIN course ON course.course_id = course_curriculum.course_id
WHERE course_code = "CS109" AND school_year = 2001;

SELECT student_overview.student_id, student.student_firstname from student_overview
INNER JOIN student ON student_overview. student_id = student.student_id
INNER JOIN curriculum ON student_overview.curriculum_id = curriculum.curriculum_id
LEFT JOIN class ON class.class_code = curriculum.class_code
INNER JOIN course_curriculum ON course_curriculum.curriculum_id = curriculum.curriculum_id
WHERE course_id =3 AND school_year = 2001;

SELECT course_code FROM course 
INNER JOIN course_curriculum ON course.course_id = course_curriculum.course_id WHERE curriculum_id =  3;