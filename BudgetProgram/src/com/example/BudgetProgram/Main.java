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
        double food = 0.0;
        double drink = 0.0;
        double ent = 0.0;
        double subs = 0.0;
        double petrol = 0.0;
        double bills = 0.0;
        double gifts = 0.0;
        double other = 0.0;

        System.out.println("");
        System.out.println("==================================================");

        //ask for inputs of amount spent for different categories
        do {
            System.out.println("Choose a category for your expenses, or enter a negative number to continue.");
            System.out.println("\t1. Food");
            System.out.println("\t2. Drink");
            System.out.println("\t3. Entertainment");
            System.out.println("\t4. Subscriptions");
            System.out.println("\t5. Petrol/Parking");
            System.out.println("\t6. Bills");
            System.out.println("\t7. Gifts");
            System.out.println("\t8. Other");

            //take category value, or continue
            Scanner category = new Scanner(System.in);
            int userCat = category.nextInt();

            if (userCat<=0) {
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
                    food += expense;
                    break;
                case 2:
                    drink += expense;
                    break;
                case 3:
                    ent += expense;
                    break;
                case 4:
                    subs += expense;
                    break;
                case 5:
                    petrol += expense;
                    break;
                case 6:
                    bills += expense;
                    break;
                case 7:
                    gifts += expense;
                    break;
                case 8:
                    other += expense;
                    break;
                default:
                    break;
            }
            expense = 0; //reset for next iteration

        } while (expense >= 0);

        //generate percentages for each category
        double percFood = 100 * (food/totalExpense);
        double percDrink = 100 * (drink/totalExpense);
        double percEnt = 100 * (ent/totalExpense);
        double percSubs = 100 * (subs/totalExpense);
        double percPetrol = 100 * (petrol/totalExpense);
        double percBills = 100 * (bills/totalExpense);
        double percGifts = 100 * (gifts/totalExpense);
        double percOther = 100 * (other/totalExpense);


        // INCOME ------------------------------------------------------------------------------

        //initialise income values
        double income;
        double totalIncome = 0.0;

        double work = 0.0;
        double tuition = 0.0;
        double other_inc = 0.0;

        //ask for income values for each category
        do {
            System.out.println("Choose a category for your income, or enter a negative number to continue.");
            System.out.println("\t1. Work");
            System.out.println("\t2. Tutoring");
            System.out.println("\t3. Other");

            //take category value, or continue
            Scanner incomeCat = new Scanner(System.in);
            int userCat = incomeCat.nextInt();

            if (userCat<=0) {
                break;
            }

            System.out.println("");
            //take income value
            Scanner userInc = new Scanner(System.in);
            System.out.println("Enter the amount for this expense.");
            income = userInc.nextDouble();
            totalIncome += income;

            //assign the expense to the right category
            switch (userCat) {
                case 1:
                    work += income;
                    break;
                case 2:
                    tuition += income;
                    break;
                case 3:
                    other_inc += income;
                    break;
                default:
                    break;
            }
            income = 0; //reset for next iteration

        } while (income >= 0);

        double percWork = 100 * (work/totalIncome);
        double percTuit = 100 * (tuition/totalIncome);
        double percOtherInc = 100 * (other_inc/totalIncome);


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
        System.out.printf("Food: %.1f %% ($%.2f)\n", percFood,food);
        System.out.printf("Drink: %.1f %% ($%.2f)\n", percDrink,drink);
        System.out.printf("Entertainment: %.1f %% ($%.2f)\n",percEnt,ent);
        System.out.printf("Subscriptions: %.1f %% ($%.2f)\n",percSubs,subs);
        System.out.printf("Petrol: %.1f %% ($%.2f)\n", percPetrol,petrol);
        System.out.printf("Bills: %.1f %% ($%.2f)\n", percBills,bills);
        System.out.printf("Gifts: %.1f %% ($%.2f)\n", percGifts,gifts);
        System.out.printf("Other: %.1f %% ($%.2f)\n", percOther,other);

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
        System.out.printf("Work: %.1f %% ($%.2f)\n", percWork, work);
        System.out.printf("Tuition: %.1f %% ($%.2f)\n", percTuit,tuition);
        System.out.printf("Other: %.1f %% ($%.2f)\n",percOtherInc,other_inc);

        System.out.println("");
        System.out.printf("Total Income: $%.2f\n", totalIncome);
        System.out.printf("You spent %.2f %% of your total income.\n", percSpent);
        System.out.println("==================================================");
    }
}

