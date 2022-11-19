package ExamJuly2019;

import java.util.Scanner;

public class P01PoolDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        double fee = Double.parseDouble(scan.nextLine());
        double shezlong = Double.parseDouble(scan.nextLine());
        double chadar = Double.parseDouble(scan.nextLine());

        double feeSum = people*fee;
        double shezlongSum = Math.ceil(people*0.75)*shezlong;
        double chadarSum = Math.ceil(people*0.50)*chadar;
        double allSum = feeSum+shezlongSum+chadarSum;

        System.out.printf("%.2f lv.",allSum);
    }
}
