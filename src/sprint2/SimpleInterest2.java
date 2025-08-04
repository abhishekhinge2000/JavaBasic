package sprint2;

public class SimpleInterest2 {
    public static void calculateInterest(double principle, double rate, double time){
        double Interest = (principle * rate * time ) / 100 ;
        System.out.println("Simple Interest: " +Interest);
    }

    public static void main(String[] args){
        calculateInterest(10000,5,67);
    }
}
