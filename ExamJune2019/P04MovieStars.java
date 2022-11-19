package ExamJune2019;

import java.util.Scanner;

public class P04MovieStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());

        String actor = scan.nextLine();
        boolean budgetEnd = false;

        while (!actor.equals("ACTION")){
            if (actor.length()>15){
                budget-=budget*0.20;
            }else {
                double salary =Double.parseDouble(scan.nextLine());
                budget-=salary;
            }
            if (budget<=0) {
                budgetEnd = true;
                break;
            }

            actor= scan.nextLine();
        }
        if (budgetEnd){
            System.out.printf("We need %.2f leva for our actors.",Math.abs(budget));
        }else {
            System.out.printf("We are left with %.2f leva.",budget);
        }
    }
}
