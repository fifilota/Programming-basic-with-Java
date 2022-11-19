package ExamMarch2020;

import java.util.Scanner;

public class P01BirthdayParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double rentPrice = Double.parseDouble(scan.nextLine()); // наем на залата

        double cakePrice= rentPrice*0.20; // 20% от цената на наема на залата
        double drinks = cakePrice-cakePrice*0.45; // 45% по-малко от цената на тортата
        double animator = rentPrice/3; // 1/3 от цената на наема на залата

        double budget = rentPrice+cakePrice+drinks+animator; // не забравяме да включим и цената на наема на залата!

        System.out.println(budget);
    }
}
