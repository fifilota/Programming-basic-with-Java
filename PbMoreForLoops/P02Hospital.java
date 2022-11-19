package PbMoreForLoops;

import java.util.Scanner;

public class P02Hospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int period = Integer.parseInt(scan.nextLine());

        int treated = 0;
        int untreated = 0;
        int doctors = 7;

        for (int i = 1; i <=period; i++) {
            int patients = Integer.parseInt(scan.nextLine());
            if (i%3==0 && untreated>treated){
                doctors++;
            }
            if (patients>doctors){
                treated += doctors;
                untreated += patients-doctors;
            }else {
                treated += patients;
            }
        }
        System.out.printf("Treated patients: %d.%n", treated);
        System.out.printf("Untreated patients: %d.", untreated);
    }
}
