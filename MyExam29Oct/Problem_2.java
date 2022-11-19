package MyExam29Oct;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        double budget = Double.parseDouble(scan.nextLine());
        int beers = Integer.parseInt(scan.nextLine());
        int chips = Integer.parseInt(scan.nextLine());

        double beerSum = beers*1.20;
        double chipsPrice = beerSum*0.45;
        double chipsSum = Math.ceil(chipsPrice*chips);
        double allSum = beerSum+chipsSum;

        if (allSum<=budget){
            System.out.printf("%s bought a snack and has %.2f leva left.",name,budget-allSum);
        }else {
            System.out.printf("%s needs %.2f more leva!",name,allSum-budget);
        }
    }
}
