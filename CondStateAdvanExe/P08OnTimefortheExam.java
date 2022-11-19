package CondStateAdvanExe;

import java.sql.SQLOutput;
import java.util.Scanner;

public class P08OnTimefortheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int examHour = Integer.parseInt(scan.nextLine());
        int examMinute = Integer.parseInt(scan.nextLine());
        int arrivalHour = Integer.parseInt(scan.nextLine());
        int arrivalMinute = Integer.parseInt(scan.nextLine());

        int totalMinExam = examHour*60+examMinute;
        int totalMinArrival = arrivalHour*60+arrivalMinute;
        int diffTime = Math.abs(totalMinExam-totalMinArrival);

        if (totalMinExam<totalMinArrival){
            System.out.println("Late");
            if (diffTime>=60){
            int hour = diffTime/60;
            int min = diffTime%60;
                System.out.printf("%d:%02d hours after the start", hour,min);
            }else {
                System.out.printf("%d minutes after the start",diffTime);
            }
        } else if (totalMinExam==totalMinArrival || diffTime<=30) {
            System.out.println("On time");
            if (diffTime>=1 && diffTime<=30){
                System.out.printf("%d minutes before the start",diffTime);
            }
        }else {
            System.out.println("Early");
            if (diffTime>=60){
                int hour = diffTime/60;
                int min = diffTime%60;
                System.out.printf("%d:%02d hours before the start", hour,min);
            }else {
                System.out.printf("%d minutes before the start",diffTime);
            }
        }


    }
}
