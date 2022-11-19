package ExamMarch2019;

import java.util.Scanner;

public class P04Darts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int pointsAtStart = 301;
        int success = 0;
        int fail=0;

        String command = scan.nextLine();

        while (!command.equals("Retire")){
            String zone = command;
            int points = Integer.parseInt(scan.nextLine());
            switch (zone){
                case "Double":
                    points*=2;
                    break;
                case "Triple":
                    points*=3;
                    break;
            }
            if (points<=pointsAtStart){
                pointsAtStart-=points;
                success++;
            }else {
                fail++;
            }
            if (pointsAtStart==0){
                break;
            }


            command= scan.nextLine();
        }
        if (pointsAtStart==0){
            System.out.printf("%s won the leg with %d shots.",name,success);
        }else {
            System.out.printf("%s retired after %d unsuccessful shots.",name,fail);
        }
    }
}
