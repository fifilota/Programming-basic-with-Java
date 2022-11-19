package PbMoreCondStateAdvan;

import java.util.Scanner;

public class P02BikeRace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int juniors = Integer.parseInt(scan.nextLine());
        int seniors = Integer.parseInt(scan.nextLine());
        String trace = scan.nextLine();

        double sum = 0;

        switch (trace) {
            case "trail":
                sum = juniors * 5.50 + seniors * 7;
                break;
            case "cross-country":
                sum = juniors * 8 + seniors * 9.50;
                if (juniors+seniors>=50){
                    sum=sum*0.75;
                }
                break;
            case "downhill":
                sum = juniors * 12.25 + seniors * 13.75;
                break;
            case "road":
                sum = juniors * 20 + seniors * 21.50;
                break;
        }
        double finalSum = sum*0.95;
        System.out.printf("%.2f", finalSum);
    }
}
