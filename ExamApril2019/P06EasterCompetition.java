package ExamApril2019;

import java.util.Scanner;

public class P06EasterCompetition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kozunaci = Integer.parseInt(scan.nextLine());//бр.козунаци, бр.сладкари

        int maxPoints = Integer.MIN_VALUE;
        String winner ="";
        for (int i = 1; i <=kozunaci ; i++) {//за всеки козунак на всеки сладкар
            String bakerName = scan.nextLine();//името на сладкаря
            String input = scan.nextLine();//четем точки или Стоп
            int allPoints = 0;
            while (!input.equals("Stop")){
                int points = Integer.parseInt(input);
                allPoints+=points;

                input= scan.nextLine();
            }
            System.out.printf("%s has %d points.%n",bakerName,allPoints);
            if (allPoints>maxPoints){
                maxPoints=allPoints;
                System.out.printf("%s is the new number 1!%n",bakerName);
                winner=bakerName;
            }

        }
        System.out.printf("%s won competition with %d points!",winner,maxPoints);
    }
}
