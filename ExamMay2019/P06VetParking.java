package ExamMay2019;

import java.util.Scanner;

public class P06VetParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());

        double totalPay=0;
        for (int i = 1; i <=days; i++) {
            double payPerDay=0;
            for (int j = 1; j <=hours ; j++) {
                if (i%2!=0 && j%2==0){
                    payPerDay+=1.25;
                } else if (i%2==0&&j%2!=0) {
                    payPerDay+=2.50;
                }else {
                    payPerDay+=1;
                }
            }
            totalPay+=payPerDay;
            System.out.printf("Day: %d - %.2f leva%n",i,payPerDay);
        }
        System.out.printf("Total: %.2f leva",totalPay);
    }
}
