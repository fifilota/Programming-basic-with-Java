package ExamApril2019;

import java.util.Scanner;

public class P02EasterGuests {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int guests = Integer.parseInt(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());

        double kozunaciNeeded = Math.ceil(guests*1.0/3);
        int qicaNeeded = guests*2;

        double kozunaciSum = kozunaciNeeded*4;
        double qicaSum = qicaNeeded*0.45;
        double finalSum = kozunaciSum+qicaSum;

        if (budget>=finalSum){
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.%n",kozunaciNeeded,qicaNeeded);
            System.out.printf("He has %.2f lv. left.",budget-finalSum);
        }else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.",finalSum-budget);
        }

    }
}
