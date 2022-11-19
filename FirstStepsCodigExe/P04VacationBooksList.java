package FirstStepsCodigExe;

import java.util.Scanner;

public class P04VacationBooksList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int allPages = Integer.parseInt(scan.nextLine());
        int pagesPerHour = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());

        int pagesPerDay = (allPages/days)/pagesPerHour;

        System.out.println(pagesPerDay);
    }
}
