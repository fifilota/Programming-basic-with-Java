package PbMoreForLoops;

import java.util.Scanner;

public class P06Bills {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int months = Integer.parseInt(scan.nextLine());

        double allWater = 0;
        double allInternet = 0;
        double allElectricity =0;
        double allOthers = 0;

        for (int i = 1; i <=months; i++) {
            double elPay = Double.parseDouble(scan.nextLine());
            allElectricity += elPay;
            allInternet += 15;
            allWater += 20;
            double others = (elPay + 15 + 20)*1.20;
            allOthers += others;

        }
        double average = (allElectricity+allOthers+allInternet+allWater)/months;
        System.out.printf("Electricity: %.2f lv%n",allElectricity);
        System.out.printf("Water: %.2f lv%n",allWater);
        System.out.printf("Internet: %.2f lv%n",allInternet);
        System.out.printf("Other: %.2f lv%n",allOthers);
        System.out.printf("Average: %.2f lv",average);
    }
}
