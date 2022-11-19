package ForLoopsLab;

import java.util.Scanner;

public class P10OddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n = Integer.parseInt(scan.nextLine());

        int evenSum =0;
        int oddSum =0;

        for (int i = 1; i <=n; i++) {
            int currentNum = Integer.parseInt(scan.nextLine());

            if (i%2==0){
                evenSum=evenSum+currentNum;
            }else {
                oddSum=oddSum+currentNum;
            }
        }
        if (evenSum==oddSum){
            System.out.println("Yes");
            System.out.printf("Sum = %d", evenSum);
        }else {
            int diff = Math.abs(evenSum-oddSum);
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }
    }
}
