package PbMoreCondState;

import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine()); // br.pochivni dni

        int workinDays = 365- n;

        int playTime = n*127 + workinDays*63;

        if (playTime>30000){
            int diff = Math.abs(playTime-30000);
            int hours = diff/60;
            int min = diff % 60;
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, min);
        }else {
            int diff = 30000-playTime;
            int hours = diff/60;
            int min = diff%60;
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, min);
        }
    }
}
