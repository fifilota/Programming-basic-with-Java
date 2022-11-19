package CondStateExe;

import java.util.Scanner;

public class P08LunchBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String seriesName = scan.nextLine();
        int seriesDuration = Integer.parseInt(scan.nextLine());
        int breakTimeDuration = Integer.parseInt(scan.nextLine());

        double lunchTime = breakTimeDuration/8.0;
        double relaxTime = breakTimeDuration/4.0;
        double timeForWatching =(breakTimeDuration-lunchTime-relaxTime);

        if (timeForWatching>=seriesDuration){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesName, Math.ceil(timeForWatching-seriesDuration));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesName, Math.ceil(seriesDuration-timeForWatching));
        }

    }
}
