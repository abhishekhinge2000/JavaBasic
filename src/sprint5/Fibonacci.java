//Write a java program to generate the fibonacci series using recursion ?

package sprint5;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of term: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci Series: ");
        for(int i =0; i < n ; i++){
           System.out.print(fibonacci(i) + " ");
        }
    }
    public static int fibonacci(int n){
        //Base cases
        if(n == 0) {
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
