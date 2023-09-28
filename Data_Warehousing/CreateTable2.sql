-- Active: 1695291570318@@localhost@3306@labexercise1
CREATE TABLE `student_overview` (
  `student_id` int,
  `admission_id` int,
  `curriculum_id` int
);

CREATE TABLE `student` (
  `student_id` integer PRIMARY KEY,
  `student_firstname` varchar(255),
  `student_middlename` varchar(255),
  `student_lastname` varchar(255),
  `student_gender` varchar(255),
  `student_birthdate` date,
  `student_address_id` int,
  `student_entrance_exam_score` integer,
  `student_first_choice` varchar(255),
  `student_second_choice` varchar(255),
  `student_mother_maiden_name` varchar(255),
  `student_father_name` varchar(255),
  `student_family_income` varchar(255),
  `student_scholarship_id` int,
  `student_highschool_id` int,
  `student_highschool_grade` int
);

CREATE TABLE `student_address` (
  `student_address_id` int PRIMARY KEY,
  `street_address` varchar(255),
  `city` varchar(255),
  `country_id` int
);

CREATE TABLE `student_highschool` (
  `student_highschool_id` int PRIMARY KEY,
  `highschool_street_address` varchar(255),
  `highschool_name` varchar(255),
  `country_id` int
);

CREATE TABLE `student_scholarship` (
  `student_scholarship_id` int PRIMARY KEY,
  `student_scholarship_type` varchar(255),
  `student_scholarship_name` varchar(255)
);

CREATE TABLE `admission` (
  `admission_id` int PRIMARY KEY,
  `admission_schoolyear` year,
  `admission_semester` varchar(255),
  `program_id` int,
  `college_id` int,
  `department_id` int
);

CREATE TABLE `program` (
  `program_id` int PRIMARY KEY,
  `program_name` varchar(255),
  `program_description` varchar(255),
  `program_units` int
);

CREATE TABLE `college` (
  `college_id` int PRIMARY KEY,
  `college_name` varchar(255),
  `building_id` int,
  `college_dean` varchar(255)
);

CREATE TABLE `department` (
  `department_id` int PRIMARY KEY,
  `department_affiliation` varchar(255),
  `department_chair` varchar(255)
);

CREATE TABLE `curriculum` (
  `curriculum_id` int PRIMARY KEY,
  `curriculum_version` int,
  `class_code` int,
  `fee_code` int
);

CREATE TABLE `course_curriculum` (
  `curriculum_id` int,
  `course_id` int
);

CREATE TABLE `course` (
  `course_id` int PRIMARY KEY,
  `course_code` varchar(255),
  `course_name` varchar(255),
  `course_units` int,
  `course_description` varchar(255),
  `course_prerequisites` varchar(255),
  `course_type` varchar(255),
  `course_group` varchar(255)
);

CREATE TABLE `class` (
  `class_code` int PRIMARY KEY,
  `semester` varchar(255),
  `school_year` year,
  `building_id` int,
  `room` varchar(255)
);

CREATE TABLE `fees` (
  `fee_code` int PRIMARY KEY,
  `tuition_fee` int,
  `misc_fee` int,
  `lab_fee` int,
  `price_per_unit` int
);

CREATE TABLE `building` (
  `building_id` int PRIMARY KEY,
  `building_name` varchar(255)
);

CREATE TABLE `country` (
  `country_id` int PRIMARY KEY,
  `country_name` varchar(255)
);

CREATE TABLE `professor` (
  `prof_id` int PRIMARY KEY,
  `prof_name` varchar(255)
);

CREATE TABLE `course_prof` (
  `course_id` int,
  `prof_id` int
);

ALTER TABLE `course_prof` ADD FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`);

ALTER TABLE `course_prof` ADD FOREIGN KEY (`prof_id`) REFERENCES `professor` (`prof_id`);

ALTER TABLE `student_overview` ADD FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`);

ALTER TABLE `student` ADD FOREIGN KEY (`student_address_id`) REFERENCES `student_address` (`student_address_id`);

ALTER TABLE `student` ADD FOREIGN KEY (`student_scholarship_id`) REFERENCES `student_scholarship` (`student_scholarship_id`);

ALTER TABLE `student` ADD FOREIGN KEY (`student_highschool_id`) REFERENCES `student_highschool` (`student_highschool_id`);

ALTER TABLE `student_overview` ADD FOREIGN KEY (`admission_id`) REFERENCES `admission` (`admission_id`);

ALTER TABLE `admission` ADD FOREIGN KEY (`program_id`) REFERENCES `program` (`program_id`);

ALTER TABLE `admission` ADD FOREIGN KEY (`college_id`) REFERENCES `college` (`college_id`);

ALTER TABLE `admission` ADD FOREIGN KEY (`department_id`) REFERENCES `department` (`department_id`);

ALTER TABLE `course_curriculum` ADD FOREIGN KEY (`curriculum_id`) REFERENCES `curriculum` (`curriculum_id`);

ALTER TABLE `course_curriculum` ADD FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`);

ALTER TABLE `student_overview` ADD FOREIGN KEY (`curriculum_id`) REFERENCES `curriculum` (`curriculum_id`);

ALTER TABLE `curriculum` ADD FOREIGN KEY (`class_code`) REFERENCES `class` (`class_code`);

ALTER TABLE `curriculum` ADD FOREIGN KEY (`fee_code`) REFERENCES `fees` (`fee_code`);

ALTER TABLE `student_address` ADD FOREIGN KEY (`country_id`) REFERENCES `country` (`country_id`);

ALTER TABLE `college` ADD FOREIGN KEY (`building_id`) REFERENCES `building` (`building_id`);

ALTER TABLE `class` ADD FOREIGN KEY (`building_id`) REFERENCES `building` (`building_id`);

ALTER TABLE `student_highschool` ADD FOREIGN KEY (`country_id`) REFERENCES `country` (`country_id`);
