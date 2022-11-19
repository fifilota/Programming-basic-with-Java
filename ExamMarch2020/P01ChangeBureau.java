package ExamMarch2020;

import java.util.Scanner;

public class P01ChangeBureau {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int bitcoins = Integer.parseInt(scan.nextLine());
        double cny = Double.parseDouble(scan.nextLine()); // китайски йоани
        double commission = Double.parseDouble(scan.nextLine()); // комисионната на чейндж бюрото

        int bitcoinsInLv = bitcoins*1168; // биткойни в лв
        double cnyInUSD= cny*0.15; // кит.йоани в долари
        double cnyInLv = cnyInUSD*1.76; // кит. йоани в лв
        double finalSumInLv = ((bitcoinsInLv+cnyInLv)-(bitcoinsInLv+cnyInLv)*(commission/100)); // събираме всичко получено в лв и
        // изваждаме комисионната! Да не забравим да разделим комисионната на 100, за да обърнем цялото число в %!!!
        double allInEUR=finalSumInLv/1.95; // крайната сума обръщаме в евро


        System.out.printf("%.2f",allInEUR);
    }
}
