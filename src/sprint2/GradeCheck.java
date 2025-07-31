// Display grade based on mark


package sprint2;

import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your marks");
        int marks = scanner.nextInt();

        if(marks > 90){
            System.out.println("Grade: A");
        }
        else if(marks >= 80 && marks < 90){
            System.out.println("Grade: B");
        }
        else if(marks >= 65 && marks < 80){
            System.out.println("Grade: C");
        }
       else{
           System.out.println("Grade: D");
        }
        scanner.close();
    }

}
