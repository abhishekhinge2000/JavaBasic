// Write a program to calculate sum of the digits of given number using while loop ?

package sprint3;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int sum = 0;
        while(number > 0){
            int digit = number % 10;  // Ex: 12 than digit = 2 (2 IS REMAINDER)
            sum += digit;             // 1 + 2 = 3
            number /= 10;             // 12 / 10 = 1.2
        }
        System.out.println(" The sum of the digit: " + sum);
    }
}
