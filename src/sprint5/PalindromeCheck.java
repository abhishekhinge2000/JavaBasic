//Write a java program to check the given program palindrome or not palindrome
// using StringBuffer or StringBuilder

package sprint5;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        StringBuilder input =  new StringBuilder(scanner.nextLine());
        System.out.println(isPalindrome(input)?"Palindrome":"Not a Palindrome");
    }
    public static boolean isPalindrome(StringBuilder str){
      StringBuffer reversed = new StringBuffer();
      for (int i = str.length() - 1; i >= 0; i--){
          reversed.append(str.charAt(i));
      }
        return str.toString().equals(reversed.toString());
    }

}
