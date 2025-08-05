package sprint2;

import java.util.Scanner;

public class PhLevel {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter phLevel");
        double ph = scanner.nextInt();

        if(ph < 7){
            System.out.println("ph value is low, partial water change required! ");
        }
        else if (ph >= 7 && ph <= 8){
            System.out.println("ph value is fine");
        } else if (ph > 8 && ph <= 14){
           System.out.println("ph value is high, partial water change required");
        }
        scanner.close();
    }
}
