package MyExam23Oct;

import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int target = 8848;
        int pointAtStart = 5364;
        int climbingDays =1;
        int sumClimbing = pointAtStart;
        boolean goalReached=false;
        String command = scan.nextLine();


        while (!command.equals("END")&&sumClimbing<target&&climbingDays<6){
            int meters = Integer.parseInt(scan.nextLine());

            if (command.equals("Yes")){
                climbingDays++;
                sumClimbing+=meters;
            }else {
                sumClimbing+=meters;
            }
        }
        if (sumClimbing>=target){
            System.out.printf("Goal reached for %d days!",climbingDays);
        }else {
            System.out.println("Failed!");
            System.out.printf("%d",sumClimbing);
        }
    }
}
