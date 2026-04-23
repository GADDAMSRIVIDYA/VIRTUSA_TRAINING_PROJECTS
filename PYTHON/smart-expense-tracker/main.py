import pandas as pd
import matplotlib.pyplot as plt
from datetime import datetime
import os

# ---------------- CONFIG ----------------
CATEGORIES = ['Food', 'Travel', 'Bills', 'Entertainment', 'Shopping', 'Other']
FILE_NAME = 'expenses.csv'
MONTHLY_BUDGET = 10000

# ---------------- LOAD DATA ----------------
def load_data():
    if os.path.exists(FILE_NAME):
        df = pd.read_csv(FILE_NAME)
        df['date'] = pd.to_datetime(df['date'], errors='coerce')
        df = df.dropna(subset=['date'])
        return df

    return pd.DataFrame(columns=['date', 'category', 'amount', 'description'])

# ---------------- GET MONTH DATA (COMMON FUNCTION) ----------------
def get_month_data(df):
    now = datetime.now()
    return df[
        (df['date'].dt.year == now.year) &
        (df['date'].dt.month == now.month)
    ]

# ---------------- ADD EXPENSE ----------------
def add_expense(df):
    date_input = input("Enter date (YYYY-MM-DD): ")

    try:
        date = datetime.strptime(date_input, "%Y-%m-%d")
    except:
        print("Invalid date format")
        return df

    print("Categories:", ", ".join(CATEGORIES))
    category = input("Enter category: ").strip().title()

    if category not in CATEGORIES:
        print("Invalid category")
        return df

    try:
        amount = float(input("Enter amount: "))
    except:
        print("Invalid amount")
        return df

    description = input("Enter description: ")

    new_data = {
        "date": date,
        "category": category,
        "amount": amount,
        "description": description
    }

    df = pd.concat([df, pd.DataFrame([new_data])], ignore_index=True)
    df.to_csv(FILE_NAME, index=False)

    print("Expense added successfully!")

    # ---------------- REAL-TIME BUDGET CHECK ----------------
    month_data = get_month_data(df)
    total = month_data['amount'].sum()

    print(f"\nCurrent Monthly Spending: ₹{total:.2f}")
    print(f"Budget Limit: ₹{MONTHLY_BUDGET:.2f}")

    if total > MONTHLY_BUDGET:
        print("ALERT: Budget Exceeded!")
        print(f"Over by: ₹{total - MONTHLY_BUDGET:.2f}")
    else:
        print(f"Remaining Budget: ₹{MONTHLY_BUDGET - total:.2f}")

    return df

# ---------------- MONTHLY SUMMARY ----------------
def monthly_summary(df):
    if df.empty:
        print("No data found")
        return

    month_data = get_month_data(df)

    if month_data.empty:
        print("No expenses for this month")
        return

    total = month_data['amount'].sum()

    print("\nMONTHLY SUMMARY")
    print(f"Total Spending: ₹{total:.2f}")
    print(f"Monthly Budget: ₹{MONTHLY_BUDGET:.2f}")

    if total > MONTHLY_BUDGET:
        print("ALERT: Budget Exceeded!")
        print(f"Over Budget: ₹{total - MONTHLY_BUDGET:.2f}")
    else:
        print(f"Remaining Budget: ₹{MONTHLY_BUDGET - total:.2f}")

    print("\nDetailed Expenses:")
    print(month_data[['date', 'category', 'amount', 'description']])

# ---------------- CATEGORY INSIGHTS ----------------
def category_insights(df):
    if df.empty:
        print("No data found")
        return

    month_data = get_month_data(df)

    if month_data.empty:
        print("No expenses for this month")
        return

    category_total = month_data.groupby('category')['amount'].sum()

    total = category_total.sum()

    print("\nCATEGORY BREAKDOWN")
    print(category_total)

    print(f"\nTotal Spending: ₹{total:.2f}")
    print(f"Budget: ₹{MONTHLY_BUDGET:.2f}")

    if total > MONTHLY_BUDGET:
        print("You exceeded your monthly budget!")

    if not category_total.empty:
        top_category = category_total.idxmax()
        print(f"Highest Spending Category: {top_category}")

    # Pie Chart
    if len(category_total) > 0:
        category_total.plot(kind='pie', autopct='%1.1f%%')
        plt.title("Monthly Expense Breakdown")
        plt.ylabel("")
        plt.savefig("category_pie.png") 
        plt.show()


# ---------------- MAIN MENU ----------------
def main():
    df = load_data()

    while True:
        print("\n===== SMART EXPENSE TRACKER =====")
        print("1. Add Expense")
        print("2. Monthly Summary")
        print("3. Category Insights")
        print("4. Exit")

        choice = input("Enter choice: ")

        if choice == "1":
            df = add_expense(df)

        elif choice == "2":
            monthly_summary(df)

        elif choice == "3":
            category_insights(df)

        elif choice == "4":
            print("Exiting... Goodbye!")
            break

        else:
            print("Invalid choice")

if __name__ == "__main__":
    main()
