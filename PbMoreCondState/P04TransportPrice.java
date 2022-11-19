package PbMoreCondState;

import java.util.Scanner;

public class P04TransportPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine()); // kilometers
        String time = scan.nextLine();

       double priceTaxi = 0;
       double priceBus = 0;
       double priceTrain = 0;

       switch (time){
           case "day":
               priceTaxi=n*0.79 +0.70;
               break;
           case "night":
               priceTaxi=n*0.90 + 0.70;
               break;
       }
       if (n<20){
           System.out.printf("%.2f", priceTaxi);
       } else if (n>=20 && n<100) {
           priceBus=n*0.09;
           System.out.printf("%.2f", priceBus);
       }else {
           priceTrain=n*0.06;
           System.out.printf("%.2f", priceTrain);
       }
    }
}
