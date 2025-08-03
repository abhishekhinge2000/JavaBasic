// Vowel Checker Program

package sprint2;

import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter letter in lowercase");
        char letter = scanner.next().charAt(0);
        switch (letter){
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println(letter+ " is a vowel");
                break;

            default:
                System.out.println(letter+ " is a consonant");
        }
    }
}
