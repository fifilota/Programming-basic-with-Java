package NestedLoopsExe;

import java.util.Scanner;

public class P03SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            String input = scan.nextLine();
            int sumPrimeNum=0;
            int sumNonPrimeNum =0;
            while (!input.equals("stop")){
                int number = Integer.parseInt(input);
                if (number<0){
                    System.out.println("Number is negative.");
                    input= scan.nextLine();
                    continue;
                }
                int counter =0;
                for (int i = 1; i <=number; i++) {
                    if (number%i==0){
                        counter++;
                    }
                }
                if (counter==2){
                    sumPrimeNum+=number;
                }else {
                    sumNonPrimeNum+=number;
                }

                input= scan.nextLine();
            }
        System.out.println("Sum of all prime numbers is: " + sumPrimeNum);
        System.out.println("Sum of all non prime numbers is: " + sumNonPrimeNum);
    }
}
