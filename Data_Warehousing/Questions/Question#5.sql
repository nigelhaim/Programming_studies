SELECT student_id, student_mother_maiden_name, student_father_name FROM student;

SELECT STRCMP((SELECT student_mother_maiden_name FROM student WHERE student_id=2),(SELECT student_mother_maiden_name FROM student WHERE student_id=3))

SELECT COUNT(*) FROM student WHERE student_mother_maiden_name = "Elsa H. Rodrigo";