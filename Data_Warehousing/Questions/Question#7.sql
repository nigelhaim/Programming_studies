SELECT count(*) FROM student 
INNER JOIN student_highschool 
ON student.student_highschool_id = student_highschool.student_highschool_id 
WHERE student_highschool.highschool_name = "International School of the National Artistic Arts University";