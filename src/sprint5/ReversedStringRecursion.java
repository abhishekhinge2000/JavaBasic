//Reversed String using recursion

package sprint5;

import java.util.Scanner;

public class ReversedStringRecursion {

    //Recursive function to reverse a String
    public static String reverse(String str){

        //Base case: if string is empty or has 1 character
        if(str == null || str.length() <= 1){
            return str;
        }
        //Recursive Step: last char + reverse of remaining String
        return str.charAt(str.length() -1) + reverse(str.substring(0, str.length() - 1));
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String");
        String input = scanner.nextLine();

        String reversed = reverse(input);
     System.out.println("Reversed String: " + reversed);

     scanner.close();
    }
}
