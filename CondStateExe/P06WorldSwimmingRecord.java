package CondStateExe;

import java.util.Scanner;

public class P06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double record = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double timePerMeter = Double.parseDouble(scan.nextLine()); //for 1 m.

        double ivanTime = distance*timePerMeter;
        double slowDown = Math.floor(distance/15)*12.5;
        double finalTime = ivanTime+slowDown;

        if (finalTime<record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalTime);
        }else {
            double diff = Math.abs(finalTime-record);
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        }
    }
}
