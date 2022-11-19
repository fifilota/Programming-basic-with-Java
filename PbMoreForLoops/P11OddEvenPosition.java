package PbMoreForLoops;

import java.util.Scanner;

public class P11OddEvenPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        double oddSum = 0;
        double evenSum = 0;
        double oddMin = Double.MAX_VALUE;
        double oddMax = Double.NEGATIVE_INFINITY;
        double evenMin =Double.MAX_VALUE;
        double evenMax = Double.NEGATIVE_INFINITY;
        for (int i = 1; i <= n; i++) {
           double currentNum = Double.parseDouble(scan.nextLine());
            if (i % 2 == 0) {
                evenSum += currentNum;
                if (currentNum>evenMax){
                    evenMax=currentNum;
                }
                if (currentNum < evenMin){
                    evenMin=currentNum;
                }
            } else {
                oddSum += currentNum;
                if (currentNum>oddMax){
                    oddMax=currentNum;
                }
                if (currentNum < oddMin){
                    oddMin=currentNum;
                }
            }
        }
        if (n==0){
            System.out.printf("OddSum=%.2f,%n", oddSum);
            System.out.printf("OddMin=No,%n");
            System.out.printf("OddMax=No,%n");
            System.out.printf("EvenSum=%.2f,%n", evenSum);
            System.out.printf("EvenMin=No,%n");
            System.out.printf("EvenMax=No");
        } else if (n==1) {
            System.out.printf("OddSum=%.2f,%n", oddSum);
            System.out.printf("OddMin=%.2f,%n",oddMin);
            System.out.printf("OddMax=%.2f,%n",oddMax);
            System.out.printf("EvenSum=%.2f,%n", evenSum);
            System.out.printf("EvenMin=No,%n");
            System.out.printf("EvenMax=No");
        }else {
            System.out.printf("OddSum=%.2f,%n", oddSum);
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);
            System.out.printf("EvenSum=%.2f,%n", evenSum);
            System.out.printf("EvenMin=%.2f,%n", evenMin);
            System.out.printf("EvenMax=%.2f", evenMax);
        }
    }
}
