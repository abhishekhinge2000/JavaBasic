//Priya want to enhance task buddy by displaying the duration in hours and minutes

package sprint1;

import java.util.Scanner;

public class TaskBuddy {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("===TaskBuddy Application");
        System.out.println("Enter Task name");
        String taskName = scanner.nextLine();

        System.out.println("Estimated minute for the task");
        int estimatedMinute = scanner.nextInt();
        int hours = estimatedMinute % 60;
        int minutes = estimatedMinute / 60;

        System.out.println("Task: " + taskName);
        System.out.println("The Time Required: " + hours + " hours and  " + minutes + " minutes");

    }
}
