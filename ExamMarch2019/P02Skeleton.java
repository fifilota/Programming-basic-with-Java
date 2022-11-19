package ExamMarch2019;

import java.util.Scanner;

public class P02Skeleton {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kontrolaInMin = Integer.parseInt(scan.nextLine());
        int kontrolaInSec = Integer.parseInt(scan.nextLine());
        double distanceInM = Double.parseDouble(scan.nextLine());
        int secToTake100m = Integer.parseInt(scan.nextLine());

        int sumKontrolaSec = kontrolaInMin*60+kontrolaInSec;
        double slowDawn = (distanceInM/120)*2.5;
        double marinTime = (distanceInM/100)*secToTake100m-slowDawn;

        if (marinTime<=sumKontrolaSec){
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.",marinTime);
        }else {
            System.out.printf("No, Marin failed! He was %.3f second slower.",Math.abs(marinTime-sumKontrolaSec));
        }


    }
}
