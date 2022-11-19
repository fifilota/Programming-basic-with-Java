package ExamMay2019;

import java.util.Scanner;

public class P03Mobileoperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String period = scan.nextLine();
        String contract = scan.nextLine();
        String internet = scan.nextLine();
        int  months = Integer.parseInt(scan.nextLine());

        double price = 0;

        switch (contract){
            case "Small":
                if (period.equals("one")){
                    price=9.98;
                }else {
                    price=8.58;
                }
                break;
            case "Middle":
                if (period.equals("one")){
                    price=18.99;
                }else {
                    price=17.09;
                }
                break;
            case "Large":
                if (period.equals("one")){
                    price=25.98;
                }else {
                    price=23.59;
                }
                break;
            case "ExtraLarge":
                if (period.equals("one")){
                    price=35.99;
                }else {
                    price=31.79;
                }
                break;
        }
        if (internet.equals("yes")){
            if (price<=10){
                price+=5.50;
            } else if (price<=30) {
                price+=4.35;
            } else  {
                price+=3.85;
            }
        }
        double finalSum = price*months;

        if (period.equals("two")){
            finalSum=finalSum-finalSum*0.0375;
        }
        System.out.printf("%.2f lv.",finalSum);
    }
}
