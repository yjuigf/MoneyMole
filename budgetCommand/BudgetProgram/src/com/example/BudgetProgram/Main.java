package com.example.BudgetProgram;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("==================================================");

        // EXPENSES ---------------------------------------------------------------

        System.out.println("Enter a value for your budget this month:");
        Scanner budget = new Scanner(System.in);
        double userBud = budget.nextDouble();

        double expense;
        double totalExpense = 0.0;

        //initialise expense values
        double[] catExpense = {0,0,0,0,0,0,0,0};

        System.out.println("");
        System.out.println("==================================================");

        //ask for inputs of amount spent for different categories
        do {
            System.out.println("Choose a category for your expenses, or continue.");
	        System.out.println("\t1. Food");
            System.out.println("\t2. Drink");
            System.out.println("\t3. Entertainment");
            System.out.println("\t4. Subscriptions");
            System.out.println("\t5. Petrol/Parking");
            System.out.println("\t6. Bills");
            System.out.println("\t7. Gifts");
            System.out.println("\t8. Other");
	        System.out.println("\t9. Continue");

            //take category value, or continue
            Scanner category = new Scanner(System.in);
            int userCat = category.nextInt();

            if (userCat==9) {
                break;
            }

            System.out.println("");
            //take expense value
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter the amount for this expense.");
            expense = keyboard.nextDouble();
            totalExpense += expense;

            //assign the expense to the right category
            switch (userCat) {
                case 1:
                    catExpense[0] += expense;
                    break;
                case 2:
                    catExpense[1] += expense;
                    break;
                case 3:
                    catExpense[2] += expense;
                    break;
                case 4:
                    catExpense[3] += expense;
                    break;
                case 5:
                    catExpense[4] += expense;
                    break;
                case 6:
                    catExpense[5] += expense;
                    break;
                case 7:
                    catExpense[6] += expense;
                    break;
                case 8:
                    catExpense[7] += expense;
                    break;
                default:
                    break;
            }
            expense = 0; //reset for next iteration

        } while (expense >= 0);

        //generate percentages for each category
        double[] percExpense = {0,0,0,0,0,0,0,0};
        for (int i=0; i<8; i++) {
            if (catExpense[i] != 0) {
                percExpense[i] = 100 * (catExpense[i] / totalExpense);
            };
        }

        // INCOME ------------------------------------------------------------------------------

        //initialise income values
        double income;
        double totalIncome = 0.0;

        double[] catIncome = {0,0,0};

        //ask for income values for each category
        do {
            System.out.println("Choose a category for your income, or continue.");
            System.out.println("\t1. Work");
            System.out.println("\t2. Tutoring");
            System.out.println("\t3. Other");
            System.out.println("\t4. Continue");

            //take category value, or continue
            Scanner incomeCat = new Scanner(System.in);
            int userCat = incomeCat.nextInt();

            if (userCat==4) {
                break;
            }

            System.out.println("");
            //take income value
            Scanner userInc = new Scanner(System.in);
            System.out.println("Enter the amount for this income.");
            income = userInc.nextDouble();
            totalIncome += income;

            //assign the expense to the right category
            switch (userCat) {
                case 1:
                    catIncome[0] += income;
                    break;
                case 2:
                    catIncome[1] += income;
                    break;
                case 3:
                    catIncome[2] += income;
                    break;
                default:
                    break;
            }
            income = 0; //reset for next iteration

        } while (income >= 0);

        //generate percentages of income
        double[] percIncome = {0,0,0};
        for (int i=0; i<3; i++) {
            if (catIncome[i] != 0) {
                percIncome[i] = 100 * (catIncome[i] / totalIncome);
            }
        }


        // RESULTS --------------------------------------------------------------------------

        //get current month and year
        int month = Calendar.getInstance().get(Calendar.MONTH);
        int year = Calendar.getInstance().get(Calendar.YEAR);
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("");
        System.out.println("");
        System.out.println("==================================================");
        System.out.println("Breakdown of Spending for " + months[month] + " " + year);

        //check if budget is met
        double balance = userBud - totalExpense;
        if (balance < 0) {
            System.out.println("You are over budget by $" + Math.abs(balance) + ".");
        } else if (balance > 0) {
            System.out.println("You are under budget by $" + balance + ".");
        } else {
            System.out.println("You are exactly on budget.");
        }
        System.out.println("");

        //display percentages (spending)
        String[] catExpenseStr = {"Food","Drink","Entertainment","Subscriptions","Petrol/Parking","Bills","Gifts","Other"};
        int j = 0;
        for (int i=0; i<8; i++) {
            if (percExpense[i] != 0) {
                System.out.printf("%s: %.1f %% ($%.2f)\n", catExpenseStr[i],percExpense[i],catExpense[i]);
                j++;
            }
        }

        if (j==0) {
            System.out.println("You didn't spend any money this month.");
        }

        //display total expenses
        System.out.println("");
        System.out.printf("Total Expenses: $%.2f\n", totalExpense);
        System.out.println("==================================================");
        System.out.println("");
        System.out.println("");
        System.out.println("==================================================");

        System.out.println("Breakdown of Income for " + months[month] + " " + year);
        //find percentage of spending of income
        double percSpent = 100 * (totalExpense/totalIncome);

        //display percentages (income)
        String[] catIncomeStr = {"Work","Tuition","Other"};
        int k = 0;
        for (int i=0; i<3; i++) {
            if (percIncome[i] != 0) {
                System.out.printf("%s: %.1f %% ($%.2f)\n", catIncomeStr[i],percIncome[i],catIncome[i]);
                k++;
            }
        }

        if (k==0) {
            System.out.println("You didn't earn any money this month.");
        }

        System.out.println("");
        System.out.printf("Total Income: $%.2f\n", totalIncome);
        System.out.printf("You spent %.2f %% of your total income.\n", percSpent);
        System.out.println("==================================================");
    }
}

