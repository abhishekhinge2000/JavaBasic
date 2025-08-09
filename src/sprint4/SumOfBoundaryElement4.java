package sprint4;

import java.util.Scanner;

public class SumOfBoundaryElement4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Input rows and columns
        System.out.println("Enter Numbers of rows: ");
        int rows = scanner.nextInt();

        System.out.println("Enter Number of columns");
        int cols = scanner.nextInt();

        int[][] matrix = new int [rows][cols];

        // Input matrix element
        System.out.println("Enter Matrix Elements");

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        System.out.println("\nBoundary Elements: ");

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){

                // Check if element on boundary
                if(i == 0 || i == rows - 1 || j == 0 || j == cols - 1){
                    System.out.print(matrix[i][j] + " ");
                    sum += matrix[i][j];
                }
                else{
                    System.out.print("  "); // Blank space for non-boundary
                }
            }
            System.out.println();
        }

        //output
        System.out.println("\nSum of Boundary Elements: " + sum);

        scanner.close();
    }
}
