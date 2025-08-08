// ReverseDigits
package sprint3;

import java.util.Scanner;

public class ReverseDigits3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Ask for input
        System.out.println("Enter the number to reverse it: ");
        int num = scanner.nextInt();

        //validate input
        if(num < 0){
            System.out.println("Input number can not be negative: ");
        }
        else if(num == 0){
            System.out.println("Input number cannot be zero: ");
        }
        else {
            int reversed = 0;
            int temp = num;

            //Reverse the digits
            while(temp !=0){
                int digit = temp % 10;  // get last digit
                reversed = reversed * 10 + digit;  // append digit
                temp /= 10; // remove the last digit
            }
            //Display result
            System.out.println("The reversed of given number is: " + reversed);
        }
        scanner.close();
    }
}
