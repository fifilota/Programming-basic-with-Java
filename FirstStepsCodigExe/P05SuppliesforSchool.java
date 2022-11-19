package FirstStepsCodigExe;

import java.util.Scanner;

public class P05SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//
//        Пакет химикали - 5.80 лв.
//        Пакет маркери - 7.20 лв.
//        Препарат - 1.20 лв (за литър)
        int pencilsC = Integer.parseInt(scan.nextLine());
        int markersC = Integer.parseInt(scan.nextLine());
        int prepL = Integer.parseInt(scan.nextLine());
        int discount = Integer.parseInt(scan.nextLine());

        double sumPencils = pencilsC*5.80;
        double sumMarkers = markersC*7.20;
        double sumPrep = prepL*1.20;
        double finalSum = (sumPencils+sumMarkers+sumPrep) * ((100-discount*1.0)/100);

        System.out.println(finalSum);
    }
}
