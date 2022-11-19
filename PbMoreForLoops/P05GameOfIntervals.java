package PbMoreForLoops;

import java.util.Scanner;

public class P05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int move = Integer.parseInt(scan.nextLine());

        double result = 0;
        int num0To9Count =0;
        int num10To19Count =0;
        int num20To29Count=0;
        int num30To39Count=0;
        int num40To50Count=0;
        int invalidNumCount=0;

        for (int i = 1; i <=move; i++) {
            int num = Integer.parseInt(scan.nextLine());
                if (num>=0&&num<=9){
                    num0To9Count++;
                    result+=num*0.20;
                } else if (num>=10 && num<=19) {
                    num10To19Count++;
                    result+=num*0.30;
                } else if (num>=20&&num<=29) {
                    num20To29Count++;
                    result+=num*0.40;
                } else if (num>=30&&num<=39) {
                    num30To39Count++;
                    result+=50;
                } else if (num>=40&&num<=50) {
                    num40To50Count++;
                    result+=100;
                }else {
                    invalidNumCount++;
                    result=result/2;
                }
        }
        double p1 =num0To9Count*1.00/move*100;
        double p2 =num10To19Count*1.00/move*100;
        double p3 =num20To29Count*1.00/move*100;
        double p4 =num30To39Count*1.00/move*100;
        double p5 =num40To50Count*1.00/move*100;
        double p6 =invalidNumCount*1.00/move*100;

        System.out.printf("%.2f%n",result);
        System.out.printf("From 0 to 9: %.2f%%%n",p1);
        System.out.printf("From 10 to 19: %.2f%%%n",p2);
        System.out.printf("From 20 to 29: %.2f%%%n",p3);
        System.out.printf("From 30 to 39: %.2f%%%n",p4);
        System.out.printf("From 40 to 50: %.2f%%%n",p5);
        System.out.printf("Invalid numbers: %.2f%%",p6);
    }
}