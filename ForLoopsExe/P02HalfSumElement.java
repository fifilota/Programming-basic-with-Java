package ForLoopsExe;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int maxNum = Integer.MIN_VALUE;
        for (int i = 1; i <=n; i++) {
            int currentNum = Integer.parseInt(scan.nextLine());
            sum = sum + currentNum;
            if (currentNum>maxNum){
                maxNum=currentNum;
            }
        }
        int sumWithoutMaxNum = sum-maxNum;
        if (maxNum==sumWithoutMaxNum){
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxNum);
        }else {
            int diff = Math.abs(maxNum-sumWithoutMaxNum);
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }
    }
}
