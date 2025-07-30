// Temperature in celsius

package sprint1;

import java.util.Scanner;

public class TemperatureInFahrenheit1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in fahrenheit");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5/9;

        System.out.println("Temperature in celsius: " + celsius);
    }

}