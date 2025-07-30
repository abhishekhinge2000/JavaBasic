package sprint1;

public class SwapTwoNumber {
    public static void main(String[] args){
        int num1 = 34;
        int num2 = 45;

        System.out.println("Before Swap num1 = " + num1 + " num2= " +num2);

         num1 = num1 + num2;
         num2 = num1 - num2;
         num1 = num1 - num2;

        System.out.println("After Swap num1= " + num1 + " num2= " + num2);
    }
}
