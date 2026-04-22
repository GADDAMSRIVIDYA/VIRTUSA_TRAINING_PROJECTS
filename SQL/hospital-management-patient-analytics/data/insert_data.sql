USE hospital_db;

INSERT INTO Patients (name, age, gender) VALUES
('Ravi', 22, 'Male'),
('Sita', 23, 'Female'),
('Sri', 21, 'Female');


INSERT INTO Patients (name, age, gender) VALUES
('Arjun', 30, 'Male'),
('Meena', 28, 'Female'),
('Kiran', 35, 'Male'),
('Anjali', 26, 'Female'),
('Rahul', 40, 'Male'),
('Pooja', 32, 'Female'),
('Vikram', 45, 'Male');

INSERT INTO Doctors (name, specialization) VALUES
('Dr. Mohan', 'Cardiology'),
('Dr. Shreya', 'Neurology');

INSERT INTO Doctors (name, specialization) VALUES
('Dr. Kumar', 'Orthopedics'),
('Dr. Priya', 'Pediatrics'),
('Dr. Raj', 'Dermatology'),
('Dr. Neha', 'Gynecology'),
('Dr. Arvind', 'General Medicine'),
('Dr. Kavya', 'ENT'),
('Dr. Ramesh', 'Oncology'),
('Dr. Sneha', 'Psychiatry');

INSERT INTO Appointments (patient_id, doctor_id, date) VALUES
(1,1,'2026-04-20'),
(2,1,'2026-04-21'),
(3,2,'2026-04-22');

INSERT INTO Appointments (patient_id, doctor_id, date) VALUES
(4,3,'2026-04-23'),
(5,4,'2026-04-24'),
(6,5,'2026-04-25'),
(7,6,'2026-04-26'),
(8,7,'2026-04-27'),
(9,8,'2026-04-28'),
(10,9,'2026-04-29');

INSERT INTO Treatments (patient_id, diagnosis, cost) VALUES
(1,'Heart Problem',5000),
(2,'Fever',1000),
(3,'Migraine',2000);


INSERT INTO Treatments (patient_id, diagnosis, cost) VALUES
(4,'Fracture',7000),
(5,'Cold',800),
(6,'Skin Allergy',1500),
(7,'Pregnancy Checkup',3000),
(8,'General Checkup',500),
(9,'Cancer Treatment',20000),
(10,'Depression',4000);