package ForLoopsExe;

import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int groupCount = Integer.parseInt(scan.nextLine());

        int musala = 0;
        int monblan = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;
        int allPeople = 0;
        for (int i = 1; i <=groupCount; i++) {
            int peopleInGroup = Integer.parseInt(scan.nextLine());

            if (peopleInGroup<=5){
                musala=musala+peopleInGroup;
                allPeople=allPeople+peopleInGroup;
            } else if (peopleInGroup<=12) {
                monblan=monblan+peopleInGroup;
                allPeople=allPeople+peopleInGroup;
            } else if (peopleInGroup<=25) {
                kilimandjaro=kilimandjaro+peopleInGroup;
                allPeople=allPeople+peopleInGroup;
            } else if (peopleInGroup<=40) {
                k2=k2+peopleInGroup;
                allPeople=allPeople+peopleInGroup;
            }else {
                everest=everest+peopleInGroup;
                allPeople=allPeople+peopleInGroup;
            }
        }
        double musalaP= musala*1.0/allPeople*100;
        double monblanP= monblan*1.0/allPeople*100;
        double kilimandjaroP= kilimandjaro*1.0/allPeople*100;
        double k2P= k2*1.0/allPeople*100;
        double everestP= everest*1.0/allPeople*100;

        System.out.printf("%.2f%%%n",musalaP);
        System.out.printf("%.2f%%%n",monblanP);
        System.out.printf("%.2f%%%n",kilimandjaroP);
        System.out.printf("%.2f%%%n",k2P);
        System.out.printf("%.2f%%%n",everestP);
    }
}
