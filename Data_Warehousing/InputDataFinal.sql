-- Active: 1695291570318@@localhost@3306@labexercise1
INSERT INTO building (building_id, building_name) VALUES 
    (1, "Main Building"), 
    (2, "Blessed Pio Georgio Frassati");

-- SELECT * FROM building;

INSERT INTO college (college_id, college_name, building_id, college_dean) VALUES 
(1, "College of Information and Computing Sciences", 2, "Juan Luna"),
(2, "College of Science", 1, "Apolinario Mabini");

-- SELECT * FROM college;

INSERT INTO program (program_id, program_name, program_description, program_units) VALUES
(1, "Bachelor of Science in Computer Science", "Aims to provide knowledge in Computer Science", 37),
(2, "Bachelor of Science in Physics", "Aims to provide knowledge in Physics", 39);

-- SELECT * FROM program;

INSERT INTO department (department_id, department_affiliation, department_chair) VALUES
(1, "Department of Computer Science", "Jose Rizal"),
(2, "Department of Physics", "Andres Bonifacio");

-- SELECT * FROM department;

INSERT INTO admission (admission_id, admission_schoolyear, admission_semester, program_id, college_id, department_id) VALUES
(1, 2001, "1st Semester", 1, 1, 1),
(2, 2002, "1st Semester", 1, 1, 1),
(3, 2002, "1st Semester", 2, 2, 2),
(4, 2001, "1st Semester", 2, 2, 2);

-- SELECT* from admission;

INSERT INTO course (course_id, course_code, course_name, course_units, course_description, course_prerequisites, course_type, course_group) VALUES
(1, "CS110", "Theory of Computation", 3, "Studies the theory of computation", "CS109", "Lecture", "Professional"),
(2, "RW2", "Works of Rizal", 3, "Studies the Works of Rizal", "RW1", "Lecture", "General"),
(3, "CS109", "Algorithms and Complexity", 3, "Studies algorithms and complexity", "CS108", "Lecture", "Professional"),
(4, "FIL23", "Filipino Literature", 3, "Studies Philippine Literature", "CS109", "Lecture", "General"),
(5, "PHYS110", "Statistical Mechanics", 3, "Studies statistical mechanics", "PHYS109", "Laboratory", "Professional"),
(6, "PHYS112", "Quantum Mechanics", 3, "Studies quantum mechanics", "PHYS111", "Lecture", "Professional"),
(7, "PE4", "Physical Education 4", 3, "Studies Physical Education", "PE3", "Laboratory", "General");

SELECT * FROM course;

INSERT INTO professor(prof_id, prof_name) VALUES 
(1, "Henry Yrneh"),
(2, "Josie Eisoj"),
(3, "Albert Trebla"),
(4, "Madeline Eniledam"),
(5, "Albus Subla");

INSERT INTO course_prof (course_id, prof_id) VALUES
(1, 1),
(2,1),
(3,1),
(4,2),
(5,3),
(6,3),
(5,4),
(7,5);

INSERT INTO class (class_code, semester, school_year, building_id, room) VALUES
(1, "1st Semester", 2002, 2, "Room A"),
(4, "2nd Semester", 2003, 2, "Room D"),
(2, "2nd Semester", 2001, 2, "Room D"),
(3, "1st Semester", 2001, 2, "Room A"),
(5, "2nd Semester", 2002, 1, "Room B"),
(6, "1st Semester", 2001, 1, "Room C"),
(7, "1st Semester", 2001, 1, "Room B"),
(8, "2nd Semester", 2001, 1, "Field A");

-- SELECT * FROM class;

INSERT INTO fees (fee_code, tuition_fee, misc_fee, lab_fee, price_per_unit) VALUES
(1, 37000, 2500, 10000, 1000),
(2, 39000, 5000, 20000, 1000);

-- SELECT * FROM fees;


INSERT INTO curriculum (curriculum_id, curriculum_version, class_code, fee_code) VALUES
(1, 2001, 1, 1),
(2, 2001, 2, 1),
(3, 2001, 3, 1),
(4, 1996, 1, 1),
(5, 1996, 4, 1),
(6, 2001, 5, 2),
(7, 1996, 5, 2),
(8, 1996, 6, 2),
(9, 1996, 7, 2),
(10, 2001, 8, 2);

-- SELECT * FROM curriculum;

INSERT INTO country (country_id, country_name) VALUES (1, "Philippines");

INSERT INTO student_address (student_address_id, street_address, city, country_id) VALUES
(1, "L'oreal Street", "Makati City", 1),
(2, "P. Florentino Street", "Manila City", 1),
(3, "Navarra Street", "Quezon City", 1),
(4, "Bagumbuhay Street", "Manila City", 1),
(5, "Espana Avenue", "Quezon City", 1),
(6, "Maginhawa Street", "Makati City", 1),
(7, "Matalino Street", "Makati City", 1);

-- SELECT * FROM student_address;

INSERT INTO student_scholarship (student_scholarship_id, student_scholarship_type, student_scholarship_name) VALUES
(1, "N/A", "N/A"),
(2, "DOST Scholarship", "Merit-based"),
(3, "Entrance Merit Scholarship", "Merit-based"),
(4, "POEA Scholarship", "Needs-based"),
(5, "DOST Scholarship", "Needs-based");

-- SELECT * FROM student_scholarship;

INSERT INTO student_highschool (student_highschool_id, highschool_street_address, highschool_name, country_id) VALUES
(1, "International Street", "International School of the National Artistic Arts University", 1),
(2, "Mababang Bundok Street", "Mataas na Paaralan ng Lungsod ng Maynila", 1),
(3, "Mababang Bundok Street", "Mataas na Paaralan ng Mababang Bundok", 1);
-- SELECT * FROM student_highschool;

INSERT INTO student(student_id, student_firstname, student_middlename, student_lastname, student_gender, student_birthdate,
student_address_id, student_entrance_exam_score, student_first_choice, student_second_choice, student_mother_maiden_name,
student_father_name, student_family_income, student_scholarship_id, student_highschool_id, student_highschool_grade) VALUES
(1, "Ariana", "Falls", "Venti", "Female", '1987-02-14', 1, 92, "Bachelor of Arts in Literature", 
"Bachelor of Science in Pharmacy", "Baga T. Falls", "Cinco H. Venti", 7000000, 1, 1, 92),
(2, "Olivia", "Rodrigo", "Duterte", "Female", '1990-03-13', 2, 80, "Bachelor of Science in Physics", 
"Bachelor of Science in Physical Education", "Elsa H. Rodrigo", "Rudy E. Duterte", 335000, 2, 2, 98),
(3, "Sandra", "Rodrigo", "Bullok", "Female", '1980-11-13', 3, 92, "Bachelor of Science in Pharmacy", 
"Bachelor of Science in Computer Science", "Elsa H. Rodrigo", "Narciso A. Bullok", 1000000, 3, 3, 92),
(4, "Taylor", "Lautner", "Sheesh", "Non-Binary", '1995-06-10', 4, 84, "Bachelor of Arts in Filipino", 
"Bachelor of Arts in Communication Arts", "Margeary Z. Lautner", "Tom Z. Sheesh", 2600000, 1, 1, 70),
(5, "Whammy", "Hieu", "Jackman", "Male", '2002-01-02', 5, 77, "Bachelor of Science in Physics", 
"Bachelor of Science in Computer Science", "Tran A. Hieu", "Hugh C. Jackman", 250000, 4, 3, 80),
(6, "Zack", "Tabuldo", "Apron", "Male", '2001-12-10', 6, 95, "Bachelor of Science in Computer Science", 
"Bachelor of Arts in Filipino", "Matutina P. Tabudlo", "Keech N. Apron", 150000, 5, 3, 90),
(7, "Zendaya", "Holland", "Park", "Female", '1992-09-10', 7, 90, "Bachelor of Science in Computer Science", 
"Bachelor of Arts in Filipino", "Alexandra X. Holland", "Jing-nae Park", 15000000, 1, 1, 75);

-- SELECT * FROM student;

INSERT INTO course_curriculum(curriculum_id, course_id) VALUES (1, 1);
INSERT INTO course_curriculum(curriculum_id, course_id) VALUES (2, 2);
INSERT INTO course_curriculum(curriculum_id, course_id) VALUES (3, 3);
INSERT INTO course_curriculum(curriculum_id, course_id) VALUES (4, 1);
INSERT INTO course_curriculum(curriculum_id, course_id) VALUES (5, 4);
INSERT INTO course_curriculum(curriculum_id, course_id) VALUES (6, 5);
INSERT INTO course_curriculum(curriculum_id, course_id) VALUES (7, 5);
INSERT INTO course_curriculum(curriculum_id, course_id) VALUES (8, 6);
INSERT INTO course_curriculum(curriculum_id, course_id) VALUES (9, 6);
INSERT INTO course_curriculum(curriculum_id, course_id) VALUES (10, 7);
SELECT * FROM course_curriculum;


INSERT INTO student_overview(student_id, admission_id, curriculum_id) VALUES (2, 2, 1);
INSERT INTO student_overview(student_id, admission_id, curriculum_id) VALUES (2, 2, 3);
INSERT INTO student_overview(student_id, admission_id, curriculum_id) VALUES (6, 3, 6);
INSERT INTO student_overview(student_id, admission_id, curriculum_id) VALUES (6, 3, 10);
INSERT INTO student_overview(student_id, admission_id, curriculum_id) VALUES (7, 2, 1);
INSERT INTO student_overview(student_id, admission_id, curriculum_id) VALUES (1, 1, 1);
INSERT INTO student_overview(student_id, admission_id, curriculum_id) VALUES (1, 1, 2);
INSERT INTO student_overview(student_id, admission_id, curriculum_id) VALUES (3, 1, 4);
INSERT INTO student_overview(student_id, admission_id, curriculum_id) VALUES (3, 1, 5);
INSERT INTO student_overview(student_id, admission_id, curriculum_id) VALUES (5, 4, 7);
INSERT INTO student_overview(student_id, admission_id, curriculum_id) VALUES (5, 4, 8);
INSERT INTO student_overview(student_id, admission_id, curriculum_id) VALUES (5, 4, 9);
INSERT INTO student_overview(student_id, admission_id, curriculum_id) VALUES (4, 3, 6);
SELECT * FROM student_overview;

