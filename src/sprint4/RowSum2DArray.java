// Given the 2D Array {{1,2,3,4},{2,3,4,5},{3,,4,5,6}}.
// Find the sum of each row and display the result ?

package sprint4;

public class RowSum2DArray {
    public static void main(String[] args){
        int[][] array = {
                {1,2,3,4},
                {2,3,4,5},
                {3,4,5,6}
        };
        for(int i = 0; i< array.length; i++){
        int sum = 0;
        for(int j= 0; j< array[i].length; j++) {
            sum += array[i][j];
        }
        System.out.println("Sum of row " +(i + 1)+ ": " + sum);
        }
    }
}
