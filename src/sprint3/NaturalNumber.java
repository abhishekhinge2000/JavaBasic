// write a program that print the natural number between two number ?

package sprint3;

import java.util.Scanner;

public class NaturalNumber {
    public static void printNaturalNumber(int start, int end){
        for(int num = start; num <= end; num++){
            System.out.println(num);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter start number");
        int start = scanner.nextInt();

        System.out.println("Enter end number");
        int end = scanner.nextInt();

        printNaturalNumber(start, end);
    }
}
