package PbMoreForLoops;

import java.util.Scanner;

public class P01BackToThePast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double money = Double.parseDouble(scan.nextLine());
        int yearOfEnd = Integer.parseInt(scan.nextLine());

        int yearsIvan = 18;
        double spentMoney = 0;
        for (int i = 1800; i <=yearOfEnd; i++) {
            yearsIvan++;
            if (i%2==0){
                spentMoney=spentMoney+12000;
            }else {
                spentMoney=spentMoney+12000 + 50*(yearsIvan-1);
            }
        }
        if (money>=spentMoney){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",money-spentMoney);
        }else {
            System.out.printf("He will need %.2f dollars to survive.", spentMoney-money);
        }
    }
}
