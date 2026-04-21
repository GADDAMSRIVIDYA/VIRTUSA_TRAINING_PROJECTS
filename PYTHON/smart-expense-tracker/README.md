# 💰 Smart Expense Tracker (Python)

 Project Description

Smart Expense Tracker is a command-line Python application that helps users track daily expenses, analyze monthly spending, and visualize category-wise insights using charts.

 Features

* Add expenses
*  Monthly summary
*  Category insights
*  Pie chart visualization
*  Budget alerts
*  CSV data storage


Technologies Used

* Python
* Pandas
* Matplotlib
  
Project Structure

expense_tracker.py
expenses.csv
category_pie.png
README.md

Sample Input (expenses.csv)

date,category,amount,description
2026-04-11,Shopping,2000.0,Shooping
2026-04-10,Food,500.0,biriyani
2026-03-02,Travel,5000.0,hyderabad
2026-04-11,Food,500.0,food
2026-03-11,Travel,5000.0,traveling
2026-03-12,Shopping,2000.0,shopping
2026-04-12,Food,500.0,biriyani
2026-04-12,Travel,5000.0,uber
2026-04-11,Food,5000.0,biriyani
2026-04-11,Travel,6000.0,travle
2026-04-11,Shopping,5000.0,dress
2026-04-11,Food,200.0,cury


Sample Output

Monthly Summary

MONTHLY SUMMARY
Total Spending: ₹24700.00
Monthly Budget: ₹10000.00
⚠️ ALERT: Budget Exceeded!
Over Budget: ₹14700.00

Category Insights

 CATEGORY BREAKDOWN
Food        6200
Travel     11000
Shopping    7000

Total Spending: ₹24700.00
Budget: ₹10000.00
⚠️ You exceeded your monthly budget!
 Highest Spending Category: Travel


 Pie Chart Output

* A pie chart will be displayed showing category-wise spending.
* You can save it as `category_pie.png` by modifying code:

python
plt.savefig("category_pie.png")

 How to Run

 Step 1: Install dependencies

 pip install pandas matplotlib

 Step 2: Run the program


python expense_tracker.py

 How It Works

* Reads expenses from CSV file
* Filters current month data
* Groups data by category using `groupby()`
* Finds highest spending using `idxmax()`
* Visualizes using pie chart
  
 Future Improvements

* GUI using Tkinter
* Web version (React + Flask)
* Export reports (PDF/Excel)
* Smart spending suggestions

Author

Gaddam Srividya

---
