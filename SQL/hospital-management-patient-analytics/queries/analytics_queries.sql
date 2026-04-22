USE hospital_db;

-- 
SELECT d.name, COUNT(*) AS total_visits
FROM Appointments a
JOIN Doctors d ON a.doctor_id = d.doctor_id
GROUP BY d.name
ORDER BY total_visits DESC;

-- Total revenue per month
SELECT DATE_FORMAT(a.date, '%Y-%m') AS month,
SUM(t.cost) AS total_revenue
FROM Appointments a
JOIN Treatments t ON a.patient_id = t.patient_id
GROUP BY month;

-- Most common diseases
SELECT diagnosis, COUNT(*) AS count
FROM Treatments
GROUP BY diagnosis
ORDER BY count DESC;

-- Patient visit frequency
SELECT patient_id, COUNT(*) AS visits
FROM Appointments
GROUP BY patient_id;

-- Doctor performance
SELECT d.name, COUNT(a.patient_id) AS patients_treated
FROM Doctors d
JOIN Appointments a ON d.doctor_id = a.doctor_id
GROUP BY d.name;