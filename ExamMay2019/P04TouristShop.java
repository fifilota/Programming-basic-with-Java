package ExamMay2019;

import java.util.Scanner;

public class P04TouristShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());

        int productCount =0;
        double spent = 0;
        boolean noMoreMoney=false;

        while (true) {
            String productType = scan.nextLine();
            if (productType.equals("Stop")) {
                System.out.printf("You bought %d products for %.2f leva.", productCount, spent);
                break;
            } else {
                double price =Double.parseDouble(scan.nextLine());
                productCount++;
                if (productCount % 3 == 0) {
                    price *= 0.50;
                }
                if (price > budget) {
                    System.out.println("You don't have enough money!");
                    System.out.printf("You need %.2f leva!", price - budget);
                    noMoreMoney = true;
                } else {
                    budget -= price;
                    spent += price;
                }
            }
            if (noMoreMoney) {
                break;
            }
        }
    }
}
