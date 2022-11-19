package NestedLoopsLab;

import java.util.Scanner;

public class P04SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        int magicNum = Integer.parseInt(scan.nextLine());

        int counter = 0;
        boolean isValid = false;
        for (int i = n1; i <= n2; i++) {
            for (int j = n1; j <= n2; j++) {
                counter++;
                int sum = i + j;
                if (sum == magicNum) {
                    isValid = true;
                    System.out.printf("Combination N:%d ", counter);
                    System.out.printf("(%d + %d = %d)", i, j, sum);
                    break;
                }
            }
            if (isValid) {
                break;
        }

        }
        if (!isValid){
            System.out.printf("%d combinations - neither equals %d",counter,magicNum);
        }
    }
}
