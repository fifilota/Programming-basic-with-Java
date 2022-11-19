package ExamJune2019;

import java.util.Scanner;

public class P01MovieProfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String film = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());
        int tickets =Integer.parseInt(scan.nextLine());
        double price = Double.parseDouble(scan.nextLine());
        int percentCinema = Integer.parseInt(scan.nextLine());

        double income = days*tickets*price;
        double finalIncome = income-income*percentCinema/100;

        System.out.printf("The profit from the movie %s is %.2f lv.",film,finalIncome);
    }
}
