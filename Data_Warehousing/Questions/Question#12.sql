SELECT AVG(student_highschool_grade) FROM student JOIN 
student_highschool ON student.student_highschool_id = 
student_highschool.student_highschool_id 
WHERE highschool_name = "Mataas na Paaralan ng Mababang Bundok";

SELECT AVG(student_highschool_grade) FROM student JOIN student_highschool 
ON student.student_highschool_id = student_highschool.student_highschool_id 
WHERE highschool_name = "International School of the National Artistic Arts University";

SELECT AVG(student_highschool_grade) FROM student 
JOIN student_highschool ON student.student_highschool_id = student_highschool.student_highschool_id 
WHERE highschool_name = "Mataas na Paaralan ng Lungsod ng Maynila";