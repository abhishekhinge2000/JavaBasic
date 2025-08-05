package sprint2;

import java.util.Scanner;

public class FencingBarn {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an option from list to calculate area of fence");

        System.out.println(" 1. Square area of chickens: ");
        System.out.println(" 2. Circle area of ducks");
        System.out.println(" 3. Rectangular area of cows: ");

        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("Enter side of square: ");
                double side = scanner.nextDouble();

                double squareArea = side * side;
                System.out.println("Area of square fence for chickens is: " + squareArea);
                break;

            case 2:
                System.out.println("Enter radius circle: ");
                double radius = scanner.nextDouble();

                double circleArea = 3.14 * radius * radius;
                System.out.println("Area of Circle fence for ducks is: " + circleArea);
                break;

            case 3:
                System.out.println("Enter length");
                double length = scanner.nextDouble();

                System.out.println("Enter width");
                double width = scanner.nextDouble();

                double rectangleArea = length * width;
                System.out.println("Area of rectangle fence for cows: " + rectangleArea);
                break;

            default:
                System.out.println("Invalid choice: ");
        }
        scanner.close();
    }
}
