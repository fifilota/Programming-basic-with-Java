package CondStateAdvanLab;

import java.util.Scanner;

public class P12TradeCommissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String town = scan.nextLine();
        double sales = Double.parseDouble(scan.nextLine());
        double result = 0;
        boolean isValid=true;

        if (sales<0){
            System.out.println("error");
        }
        switch (town) {
            case "Sofia":
                if (sales >= 0 && sales <= 500) {
                    result = 5.0 / 100;
                } else if (sales > 500 && sales <= 1000) {
                    result = 7.0 / 100;
                } else if (sales > 1000 && sales <= 10000) {
                    result = 8.0 / 100;
                } else if (sales>10000){
                    result = 12.0 / 100;
                }else {
                    isValid=false;
                }
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500) {
                    result = 4.5 / 100;
                } else if (sales > 500 && sales <= 1000) {
                    result = 7.5 / 100;
                } else if (sales > 1000 && sales <= 10000) {
                    result = 10.0 / 100;
                } else if (sales>10000){
                    result = 13.0 / 100;
                }else {
                    isValid=false;
                }
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500) {
                    result = 5.5 / 100;
                } else if (sales > 500 && sales <= 1000) {
                    result = 8.0 / 100;
                } else if (sales > 1000 && sales <= 10000) {
                    result = 12.0 / 100;
                } else if (sales>10000){
                    result = 14.5;
                }else {
                    isValid=false;
                }
                break;
            default:
            isValid=false;
        }
        if (isValid){
            double profit = sales*result;
            System.out.printf("%.2f", profit);
        }else {
            System.out.println("error");
        }
    }
}
