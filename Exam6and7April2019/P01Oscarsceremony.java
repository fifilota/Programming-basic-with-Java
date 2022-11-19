package Exam6and7April2019;

import java.util.Scanner;

public class P01Oscarsceremony {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rent = Integer.parseInt(scan.nextLine());

        double statuette = rent*0.70;
        double kettering = statuette*0.85;
        double sound = kettering/2;

        double allSum = rent+statuette+kettering+sound;

        System.out.printf("%.2f",allSum);
    }
}
