package WhileLoopsExe;

import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

        int allSteps =0;

        while (allSteps<10000){
            String command = scan.nextLine();
            if (!command.equals("Going home")){
                int steps = Integer.parseInt(command);
                allSteps+=steps;
            }else {
                int finalSteps = Integer.parseInt(scan.nextLine());
                allSteps+=finalSteps;
                break;
            }
        }
        if (allSteps>=10000){
            System.out.printf("Goal reached! Good job!%n %d steps over the goal!",allSteps-10000);
        }else {
            System.out.printf("%d more steps to reach goal.",10000-allSteps);
        }
    }
}
