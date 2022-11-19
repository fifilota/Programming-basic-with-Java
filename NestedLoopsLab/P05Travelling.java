package NestedLoopsLab;

import java.util.Scanner;

public class P05Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String  input = scan.nextLine();

        while (!input.equals("End")){
            String destination = input;
            double budget = Double.parseDouble(scan.nextLine());
            double sum = 0;
            while (sum<budget){
                double amount= Double.parseDouble(scan.nextLine());
                sum+=amount;
            }

            System.out.printf("Going to %s!%n",destination);

            input= scan.nextLine();
        }

    }
}
