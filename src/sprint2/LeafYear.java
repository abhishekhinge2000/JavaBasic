package sprint2;

import java.util.Scanner;

public class LeafYear {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Year");
        int year = scanner.nextInt();

        if((year % 4 ==0 && year % 100 !=0) || year % 400 == 0){
            System.out.println("Leaf Year");
        }
        else{
            System.out.println("Common Year");
        }

        scanner.close();
    }
}
