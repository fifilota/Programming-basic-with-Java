package PbMoreFirstSteps;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double gradesInC = Double.parseDouble(scan.nextLine());
        double gradesInF = gradesInC*1.8+32;
        System.out.printf("%.2f", gradesInF);
    }
}
