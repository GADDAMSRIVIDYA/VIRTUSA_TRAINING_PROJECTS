<h1 align="center">Hospital Management & Patient Analytics System</h1>
 Project Overview

The Hospital Management & Patient Analytics System is a SQL-based project designed to efficiently manage hospital data such as patients, doctors, appointments, and treatments. It also provides analytical insights to improve hospital operations and decision-making.

# Objectives

Design a relational database for hospital management
Store and manage patient, doctor, and treatment records
Perform data analysis on hospital operations
Generate meaningful insights from hospital data

Database Used

## OUTPUT

* Database Schema
  ![schema](https://github.com/GADDAMSRIVIDYA/VIRTUSA_TRAINING_PROJECTS/blob/main/SQL/hospital-management-patient-analytics/screenshots/tables_schema.png)
  
* Show Tables
  
  ![Show Tables](https://github.com/GADDAMSRIVIDYA/VIRTUSA_TRAINING_PROJECTS/blob/main/SQL/hospital-management-patient-analytics/screenshots/show_tables.png)

* 1. Appointments Table Insertion

     ![Appointment-1](https://github.com/GADDAMSRIVIDYA/VIRTUSA_TRAINING_PROJECTS/blob/main/SQL/hospital-management-patient-analytics/screenshots/insert_appointments1.png)
     ![Appointment-2](https://github.com/GADDAMSRIVIDYA/VIRTUSA_TRAINING_PROJECTS/blob/main/SQL/hospital-management-patient-analytics/screenshots/insert_appointments2.png)

 * 2. Doctor Table Insertion

      ![Doctor-1](https://github.com/GADDAMSRIVIDYA/VIRTUSA_TRAINING_PROJECTS/blob/main/SQL/hospital-management-patient-analytics/screenshots/insert_doctors1.png)
      ![Doctor-2](https://github.com/GADDAMSRIVIDYA/VIRTUSA_TRAINING_PROJECTS/blob/main/SQL/hospital-management-patient-analytics/screenshots/insert_doctors2.png)
* 3. Patinents Table Insertion

     ![patinents-1](https://github.com/GADDAMSRIVIDYA/VIRTUSA_TRAINING_PROJECTS/blob/main/SQL/hospital-management-patient-analytics/screenshots/insert_patinets1.png)
     ![patinents-2](https://github.com/GADDAMSRIVIDYA/VIRTUSA_TRAINING_PROJECTS/blob/main/SQL/hospital-management-patient-analytics/screenshots/insert_patinets2.png)
* 4. Treaments Table Insertion

     ![treatment-1](https://github.com/GADDAMSRIVIDYA/VIRTUSA_TRAINING_PROJECTS/blob/main/SQL/hospital-management-patient-analytics/screenshots/insert_treatments1.png)
     ![treatment-2](https://github.com/GADDAMSRIVIDYA/VIRTUSA_TRAINING_PROJECTS/blob/main/SQL/hospital-management-patient-analytics/screenshots/insert_treatments2.png)

* Most Common Diseases
  
  ![query-1](https://github.com/GADDAMSRIVIDYA/VIRTUSA_TRAINING_PROJECTS/blob/main/SQL/hospital-management-patient-analytics/screenshots/most_common_diseases.png)

* Most consulted Doctor
  
  ![query-2](https://github.com/GADDAMSRIVIDYA/VIRTUSA_TRAINING_PROJECTS/blob/main/SQL/hospital-management-patient-analytics/screenshots/most_consulted_doctors.png)

* Patient Visit Frequency

  ![query-3](https://github.com/GADDAMSRIVIDYA/VIRTUSA_TRAINING_PROJECTS/blob/main/SQL/hospital-management-patient-analytics/screenshots/patient_visit_frequency.png)

* Total revenue per month

  ![query-4](https://github.com/GADDAMSRIVIDYA/VIRTUSA_TRAINING_PROJECTS/blob/main/SQL/hospital-management-patient-analytics/screenshots/total_revenue_per_month.png)
     
* Doctor Performance

  ![query-5](https://github.com/GADDAMSRIVIDYA/VIRTUSA_TRAINING_PROJECTS/blob/main/SQL/hospital-management-patient-analytics/screenshots/doctor_performance.png)
 

Key Features / Tasks

* Store patient and doctor details
* Manage appointments between patients and doctors
* Record treatments and medical costs
* Analyze hospital performance

 SQL Analytics Queries
 
* Most Consulted Doctors

Find doctors with maximum patient visits.

* Total Revenue per Month

Calculate total income generated from treatments.

* Most Common Diseases

Identify frequently diagnosed diseases.

* Patient Visit Frequency

Track how often patients visit the hospital.

* Doctor Performance Analysis

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
## Project Structure
```
hospital-management-patient-analytics/
├── data/
|   └── insert_data.sql
├───queries/
|   └── analytics_queries.sql
├───schema/
|   ├──create_database.sql
|   └── craete_tables.sql
├── screenshots/ # output images
└── README.md
```

Outcome

A fully functional SQL-based hospital database system that helps manage hospital operations and provides useful analytical insights for better decision-making.

Author

Gaddam Srividya

