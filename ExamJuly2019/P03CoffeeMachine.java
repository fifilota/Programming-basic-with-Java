package ExamJuly2019;

import java.util.Scanner;

public class P03CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String drink = scan.nextLine();
        String sugar = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());
        double price =0.0;
        double sum =0.0;

        switch (drink){
            case "Espresso":
                if (sugar.equals("Without")){
                    price=0.90;
                    sum=price*count*0.65;
                } else if (sugar.equals("Normal")) {
                    price=1.00;
                    sum=price*count;
                }else {
                    price=1.20;
                    sum=price*count;
                }
                if (count>=5){
                    sum*=0.75;
                }
                break;
            case "Cappuccino":
                if (sugar.equals("Without")){
                    price=1.00;
                    sum=price*count*0.65;
                } else if (sugar.equals("Normal")) {
                    price=1.20;
                    sum=price*count;
                }else {
                    price=1.60;
                    sum=price*count;
                }
                break;
            case "Tea":
                if (sugar.equals("Without")){
                    price=0.50;
                    sum=price*count*0.65;
                } else if (sugar.equals("Normal")) {
                    price=0.60;
                    sum=price*count;
                }else {
                    price=0.70;
                    sum=price*count;
                }
                break;
        }
        if (sum>15){
            sum*=0.80;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.",count,drink,sum);
    }
}
