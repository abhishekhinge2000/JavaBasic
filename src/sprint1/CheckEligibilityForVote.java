//Write a Program to determine for a person is eligible for vote based on their age ?

package sprint1;

import java.util.Scanner;

public class CheckEligibilityForVote {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Username ");
        String userName = scanner.nextLine();

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        scanner.nextLine();

        if(age > 18){
            System.out.println(age+ " is eligible for vote");
        }
        else{
            System.out.println(age+ " is Not eligible for vote");
        }
    }
}
