SELECT course_name FROM course
INNER JOIN course_curriculum ON course.course_id = course_curriculum.course_id
INNER JOIN curriculum ON course_curriculum.curriculum_id = curriculum.curriculum_id 
INNER JOIN student_overview ON curriculum.curriculum_id = student_overview.curriculum_id  
INNER JOIN student ON student_overview.student_id = student.student_id  
WHERE student.student_firstname = "Taylor" AND student_lastname = "Sheesh";


SELECT COUNT(course_name) FROM course
INNER JOIN course_curriculum ON course.course_id = course_curriculum.course_id
INNER JOIN curriculum ON course_curriculum.curriculum_id = curriculum.curriculum_id 
INNER JOIN student_overview ON curriculum.curriculum_id = student_overview.curriculum_id  
INNER JOIN student ON student_overview.student_id = student.student_id  
WHERE student.student_firstname = "Taylor" AND student_lastname = "Sheesh";