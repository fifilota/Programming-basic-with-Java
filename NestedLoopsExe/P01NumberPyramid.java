package NestedLoopsExe;

import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int currentNum =1;
        boolean isBigger = false;

        for (int rows = 1; rows <=n; rows++) {
            for (int cols = 1; cols <=rows ; cols++) {
                if (currentNum>n){
                    isBigger=true;
                    break;
                }
                System.out.print(currentNum + " ");
                currentNum++;
            }
            if (isBigger){
                break;
            }
            System.out.println();
        }
    }
}
