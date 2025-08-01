// Modify the existing task buddy application to datermine the task type based on estimated minute ?

package sprint2;

import java.util.Scanner;

public class TaskBuddy {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== TaskBuddy Applications");
        System.out.println("Enter Task name");
        String TaskName = scanner.nextLine();
        System.out.println("Estimated Minute for task");
        int estimatedMinute = scanner.nextInt();
        int hours = estimatedMinute % 60;
        int minutes = estimatedMinute / 60;
        System.out.println("Task Summary");
        System.out.println("Task: " + TaskName);
        System.out.println("Time Required: " + hours + " hours and " + minutes + " minutes ");
        String TaskType;

        if(estimatedMinute <= 30){
            TaskType = " Quick Task";
        }
        else if(estimatedMinute <= 120){
            TaskType = " Single session task";
        } else if (estimatedMinute <= 300) {
            TaskType = " Half day task";
        }
        else{
            TaskType = " Full day task";
        }

        System.out.println("taskType: " + TaskType);
    }
}
