package NestedLoopsLab;

import java.util.Scanner;

public class P03Combinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int counterValidNum = 0;
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=n; j++) {
                for (int k = 0; k <=n; k++) {
                    if (i+j+k==n){
                        counterValidNum++;
                    }
                }
            }
        }
        System.out.println(counterValidNum);
    }
}
