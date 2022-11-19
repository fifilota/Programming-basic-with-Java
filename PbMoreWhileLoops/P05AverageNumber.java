package PbMoreWhileLoops;

import java.util.Scanner;

public class P05AverageNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = 1; i <=n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            sum +=num;
        }
        double average = sum*1.00/n;
        System.out.printf("%.2f",average);
    }
}
