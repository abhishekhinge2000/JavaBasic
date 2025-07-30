package sprint1;

import java.util.Scanner;

public class EvenOdd1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();

        scanner.nextLine();

        if(number % 2 == 0){
            System.out.println(number+ " is an Even number");
        }
        else{
            System.out.println(number+ " is an odd number");
        }
    }
}
