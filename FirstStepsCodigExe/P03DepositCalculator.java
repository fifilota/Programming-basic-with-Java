package FirstStepsCodigExe;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        double deposit = Double.parseDouble(scan.nextLine());
        int period = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine())/100;

        double sum = deposit + period * ((deposit*percent)/12);

        System.out.printf("%.2f", sum);
    }
}
