// Write a program that print all even numbers from 1 to N using for loop ?

package sprint3;

import java.util.Scanner;

public class PrintEvenNumbers {
    public static void printEvenNumber(int end){
        for(int i = 1 ; i <= end ; i++){
            if( i%2 == 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int end = scanner.nextInt();
        printEvenNumber(end);
    }
}
