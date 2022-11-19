package PbMoreFirstSteps;

import java.util.Scanner;

public class CircleAreaandPerimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double r = Double.parseDouble(scan.nextLine());

        double areaCircle = Math.PI*r*r;
        double perimetreCircle = 2*Math.PI*r;

        System.out.printf("%.2f%n%.2f", areaCircle, perimetreCircle);
    }
}
