package ExamApril2019;

import java.util.Scanner;

public class P02EasterParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Между 10 (вкл.) и 15 (вкл.) човека -> 15 % отстъпка от куверта за един човек
//        Между 15 и 20 (вкл.) човека -> 20 % отстъпка от куверта за един човек
//        Над 20 човека -> 25 % отстъпка от куверта за един човек

        int guests = Integer.parseInt(scan.nextLine());
        double guestPrice= Double.parseDouble(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());

        if (guests>=10&&guests<=15){
            guestPrice=guestPrice*0.85;
        } else if (guests>15 && guests<=20) {
            guestPrice=guestPrice*0.80;
        } else if (guests>20) {
            guestPrice=guestPrice*0.75;
        }
        double guestSum = guests*guestPrice;
        double cake = budget*0.10;
        double finalSum = guestSum+cake;

        if (budget>=finalSum){
            System.out.printf("It is party time! %.2f leva left.",budget-finalSum);
        }else {
            System.out.printf("No party! %.2f leva needed.",finalSum-budget);
        }

    }
}
