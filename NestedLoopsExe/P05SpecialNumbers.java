package NestedLoopsExe;

import java.util.Scanner;

public class P05SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=9; j++) {
                for (int k = 1; k <=9 ; k++) {
                    for (int l = 1; l <=9 ; l++) {
                        if (n%i==0 && n%j==0 && n%k==0 && n%l==0){
                            System.out.printf("%d%d%d%d ",i,j,k,l);
                        }
                    }
                }
            }
        }


    }
}
