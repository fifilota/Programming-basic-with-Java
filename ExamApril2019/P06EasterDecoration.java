package ExamApril2019;

import java.util.Scanner;

public class P06EasterDecoration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int customers = Integer.parseInt(scan.nextLine());

        double sumAllcustomers =0;

        for (int i = 1; i <=customers; i++) {
            String command = scan.nextLine();
            int productCount = 0;
            double toPay =0;
            while (!command.equals("Finish")){
                String product =command;
                double productPrice =0;
                switch (product){
                    case "basket":
                        productPrice=1.50;
                        toPay+=1.50;
                        productCount++;
                        break;
                    case "wreath":
                        productPrice=3.80;
                        toPay+=3.80;
                        productCount++;
                        break;
                    case "chocolate bunny":
                        productPrice=7;
                        toPay+=7;
                        productCount++;
                        break;
                }

                command= scan.nextLine();
            }
            if (productCount%2==0){
                toPay=toPay*0.80;
            }
            sumAllcustomers+=toPay;
            System.out.printf("You purchased %d items for %.2f leva.%n",productCount,toPay);
        }
        double averageBill = sumAllcustomers/customers;
        System.out.printf("Average bill per client is: %.2f leva.",averageBill);
    }
}
