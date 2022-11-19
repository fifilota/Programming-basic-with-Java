package ExamJune2019;

import java.util.Scanner;

public class P05Series {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget =Double.parseDouble(scan.nextLine());
        double totalCost =0;

        int series = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <=series; i++) {
            String serieName = scan.nextLine();
            double priceSerie = Double.parseDouble(scan.nextLine());
            switch (serieName){
                case "Thrones":
                    priceSerie=priceSerie*0.50;
                    break;
                case "Lucifer":
                    priceSerie=priceSerie*0.60;
                    break;
                case "Protector":
                    priceSerie=priceSerie*0.70;
                    break;
                case "TotalDrama":
                    priceSerie=priceSerie*0.80;
                    break;
                case "Area":
                    priceSerie=priceSerie*0.90;
                    break;
            }
            totalCost+=priceSerie;

        }
        if (totalCost>budget){
            System.out.printf("You need %.2f lv. more to buy the series!",totalCost-budget);
        }else {
            System.out.printf("You bought all the series and left with %.2f lv.",budget-totalCost);
        }
    }
}
