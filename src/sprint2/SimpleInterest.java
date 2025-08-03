package sprint2;

public class SimpleInterest {
    public static void calculateInterest(){
        double principle = 10000;
        double rate = 5;
        double time = 2.6;
        double interest = ( principle * rate * time) / 100;
        System.out.println("Simple Interest: " + interest);
    }
    public static void main(String[] args){
        calculateInterest();
    }
}
