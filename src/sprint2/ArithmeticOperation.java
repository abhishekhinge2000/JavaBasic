// Arithmetic Program

package sprint2;

import  java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = 10;
        int num2 = 5;
        double result = 0;

        System.out.println("Enter + for addition, - for substraction, * for multiplication, / for division");
        char operator = scanner.next().charAt(0);
        switch(operator) {

            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid Choice");
        }
        System.out.println("Result: " +result);
    }

}
