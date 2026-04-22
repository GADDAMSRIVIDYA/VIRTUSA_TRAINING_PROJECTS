🏥 Hospital Management & Patient Analytics System
 Project Overview

The Hospital Management & Patient Analytics System is a SQL-based project designed to efficiently manage hospital data such as patients, doctors, appointments, and treatments. It also provides analytical insights to improve hospital operations and decision-making.

Objectives

Design a relational database for hospital management
Store and manage patient, doctor, and treatment records
Perform data analysis on hospital operations
Generate meaningful insights from hospital data

Database Used

MySQL

Database Schema
1. Patients
patient_id (Primary Key)
name
age
gender

2. Doctors
doctor_id (Primary Key)
name
specialization

3. Appointments
appointment_id (Primary Key)
patient_id (Foreign Key)
doctor_id (Foreign Key)
date

4. Treatments
treatment_id (Primary Key)
patient_id (Foreign Key)
diagnosis
cost

Key Features / Tasks

* Store patient and doctor details
* Manage appointments between patients and doctors
* Record treatments and medical costs
* Analyze hospital performance

 SQL Analytics Queries
🔹 Most Consulted Doctors

Find doctors with maximum patient visits.

🔹 Total Revenue per Month

Calculate total income generated from treatments.

🔹 Most Common Diseases

Identify frequently diagnosed diseases.

🔹 Patient Visit Frequency

Track how often patients visit the hospital.

🔹 Doctor Performance Analysis

Evaluate doctors based on number of patients treated.

Technologies Used

SQL
MySQL Database MySQL
VS Code Visual Studio Code

How to Run the Project

Install MySQL and start server
Open MySQL terminal

Create database:

CREATE DATABASE hospital_db;
USE hospital_db;
Run hospital.sql file

Execute queries step-by-step

📂 Project Structure
hospital-management-patient-analytics/
├───data
├───queries
├───schema
└───screenshots
├── README.md


Outcome

A fully functional SQL-based hospital database system that helps manage hospital operations and provides useful analytical insights for better decision-making.

Author

Gaddam Srividya

