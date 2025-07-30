// Check if the number is positive or negative


package sprint1;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = scanner.nextInt();

        scanner.nextLine();

        if(number > 0){
            System.out.println(number+ " is Positive");
        }
        else{
            System.out.println(number+ "is Negative");
        }
    }

}
