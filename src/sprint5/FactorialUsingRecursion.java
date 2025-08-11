//Write a java program to find out factorial of given number using recursion ?

package sprint5;

public class FactorialUsingRecursion {
    public static int calculateFactorial(int n){
        if(n == 0){
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
    public static void main(String[] args){
        int result = calculateFactorial(5);
        System.out.println("Factorial of 5: " + result);
    }
}
