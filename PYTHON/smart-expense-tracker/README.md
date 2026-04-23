##  Smart Expense Tracker (Python)

 # Project Description

Smart Expense Tracker is a command-line Python application that helps users track daily expenses, analyze monthly spending, and visualize category-wise insights using charts.

 # Features

*  Add expenses
*  Monthly summary
*  Category insights
*  Pie chart visualization
*  Budget alerts
*  CSV data storage


# Technologies Used

* Python
* Pandas
* Matplotlib
  
# Project Structure
```

smart-expense-tracker/
├── main.py
├── category_pie.png
├── expenses.csv
└── README.md

```

# Sample Input (expenses.csv)

[CSV File Input](https://github.com/GADDAMSRIVIDYA/VIRTUSA_TRAINING_PROJECTS/blob/main/PYTHON/smart-expense-tracker/expenses.csv)


# Sample Output


# How to Run

 Step 1: Install dependencies

 pip install pandas matplotlib

 Step 2: Run the program
 
 python expense_tracker.py

 # How It Works

* Reads expenses from CSV file
* Filters current month data
* Groups data by category using `groupby()`
* Finds highest spending using `idxmax()`
* Visualizes using pie chart
  
 # Future Improvements

* GUI using Tkinter
* Web version (React + Flask)
* Export reports (PDF/Excel)
* Smart spending suggestions

# Author

Gaddam Srividya

---
