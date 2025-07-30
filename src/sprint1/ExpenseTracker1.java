package sprint1;

import java.util.Scanner;

public class ExpenseTracker1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("== Welcome to Expense Tracker");

        System.out.println("Enter the first Expense Amount (in Rs.)");
        double expense1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter description");
        String desc1 = scanner.nextLine();

        System.out.println("Enter Second Expense Amount (in Rs.) ");
        double expense2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter description");
        String desc2 = scanner.nextLine();

        System.out.println("Enter third expense amount (in Rs.) ");
        double expense3 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter description");
        String desc3 = scanner.nextLine();

        System.out.println("Expenses Recorded");

        double total = expense1 + expense2 + expense3;

        System.out.println("1. ₹" + expense1 + " on " + desc1);
        System.out.println("2. ₹" + expense2 + " on " + desc2);
        System.out.println("3. ₹" + expense3 + " on " + desc3);

        System.out.println("Total Expense: ₹ " + total);

        if(total > 1000){
            System.out.println("High Expense Recorded");
        }
        else{
            System.out.println("Within Budget!");
        }
    }
}
