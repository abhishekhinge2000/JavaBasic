// PrimeNumber

package sprint3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for input
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        boolean isPrime = true; // variable to store result

        //prime check logic
        if(num <= 1){
            isPrime = false; // 0, 1 and negative are not a prime number
        }
        else{
            for(int i = 2; i<= Math.sqrt(num); i++){
                if(num % i == 0){
                    isPrime = false;
                    break; // no need to check further
                }
            }
        }
        //output
        if(isPrime){
            System.out.println(num + " is a prime number");
        }
        else{
            System.out.println(num + " is not a prime number");
        }
    }
}
