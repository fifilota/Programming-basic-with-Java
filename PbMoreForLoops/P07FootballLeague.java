package PbMoreForLoops;

import java.util.Scanner;

public class P07FootballLeague {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scan.nextLine());
        int fans = Integer.parseInt(scan.nextLine());

        int fansA=0;
        int fansB=0;
        int fansV=0;
        int fansG=0;

        for (int i = 1; i <=fans; i++) {
            String sector = scan.nextLine();
            switch (sector){
                case "A":
                    fansA++;
                    break;
                case "B":
                    fansB++;
                    break;
                case "V":
                    fansV++;
                    break;
                case "G":
                    fansG++;
                    break;
            }
        }
        double percentA = fansA*1.00/fans*100;
        double percentB = fansB*1.00/fans*100;
        double percentV = fansV*1.00/fans*100;
        double percentG = fansG*1.00/fans*100;
        double percentAllFans = fans*1.00/stadiumCapacity*100;

        System.out.printf("%.2f%%%n",percentA);
        System.out.printf("%.2f%%%n",percentB);
        System.out.printf("%.2f%%%n",percentV);
        System.out.printf("%.2f%%%n",percentG);
        System.out.printf("%.2f%%",percentAllFans);

    }
}
