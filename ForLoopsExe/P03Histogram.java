package ForLoopsExe;

import java.util.Scanner;

public class P03Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int p1Count = 0;
        int p2Count = 0;
        int p3Count = 0;
        int p4Count = 0;
        int p5Count = 0;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (num<200){
                p1Count++;
            } else if (num >= 200 && num<400) {
                p2Count++;
            } else if (num>=400&&num<600) {
                p3Count++;
            } else if (num>=600&&num<800) {
                p4Count++;
            }else {
                p5Count++;
            }

        }
        double p1Perc = p1Count*1.00/n*100;
        double p2Perc = p2Count*1.00/n*100;
        double p3Perc = p3Count*1.00/n*100;
        double p4Perc = p4Count*1.00/n*100;
        double p5Perc = p5Count*1.00/n*100;

        System.out.printf("%.2f%%%n",p1Perc);
        System.out.printf("%.2f%%%n",p2Perc);
        System.out.printf("%.2f%%%n",p3Perc);
        System.out.printf("%.2f%%%n",p4Perc);
        System.out.printf("%.2f%%%n",p5Perc);
    }
}
