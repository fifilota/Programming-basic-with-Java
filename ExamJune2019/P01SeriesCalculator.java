package ExamJune2019;

import java.util.Scanner;

public class P01SeriesCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String series = scan.nextLine();
        int seasons = Integer.parseInt(scan.nextLine());
        int episodes = Integer.parseInt(scan.nextLine());
        double minutesEp = Double.parseDouble(scan.nextLine());
        double timeWithAdv = minutesEp*1.20;
        double specialEpTime = seasons*10;
        double allTime = Math.floor(timeWithAdv*episodes*seasons+specialEpTime);

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.",series,allTime);
    }
}
