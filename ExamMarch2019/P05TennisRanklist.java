package ExamMarch2019;

import java.util.Scanner;

public class P05TennisRanklist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tournaments = Integer.parseInt(scan.nextLine());
        int pointsAtStart = Integer.parseInt(scan.nextLine());

        int pointsFromTours= 0;
        int wCount= 0;

        for (int i = 1; i <=tournaments; i++) {
            String stage = scan.nextLine();
            switch (stage){
                case "W":
                    pointsFromTours=pointsFromTours+2000;
                    wCount++;
                    break;
                case "F":
                    pointsFromTours=pointsFromTours+1200;
                    break;
                case "SF":
                    pointsFromTours=pointsFromTours+720;
                    break;
            }
        }
        int finalPoints = pointsAtStart+pointsFromTours;
        double averagePoints = Math.floor(pointsFromTours*1.0/tournaments);
        double wPercent = wCount*1.0/tournaments*100;

        System.out.printf("Final points: %d%n", finalPoints);
        System.out.printf("Average points: %.0f%n", averagePoints);
        System.out.printf("%.2f%%", wPercent);
    }
}
