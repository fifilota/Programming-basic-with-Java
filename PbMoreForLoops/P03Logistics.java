package PbMoreForLoops;

import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cargos = Integer.parseInt(scan.nextLine());

        int minibus = 0;
        int truck = 0;
        int train = 0;
        double price = 0;
        int tonsCount = 0;

        for (int i = 1; i <=cargos; i++) {
            int tons = Integer.parseInt(scan.nextLine());
            tonsCount += tons;
            if (tons<=3){
                minibus+=tons;
                price = price + 200*tons;
            } else if (tons<=11) {
                truck+=tons;
                price = price + 175*tons;
            }else {
                train+=tons;
                price=price+120*tons;
            }
        }
        double averagePriceTon = price/tonsCount;
        double minibusP = minibus*1.00/tonsCount*100;
        double truckP = truck*1.00/tonsCount*100;
        double trainP = train*1.00/tonsCount*100;

        System.out.printf("%.2f%n",averagePriceTon);
        System.out.printf("%.2f%%%n",minibusP);
        System.out.printf("%.2f%%%n",truckP);
        System.out.printf("%.2f%%%n",trainP);
    }
}
