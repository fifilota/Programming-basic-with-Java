package CondStateLab;

import java.util.Scanner;

public class P07AreaofFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String figureType = scan.nextLine();
        double area = 0;

        if (figureType.equals("square")) {
            double a = Double.parseDouble(scan.nextLine());
            area = a * a;
        } else if (figureType.equals("rectangle")) {
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());
            area = a * b;
        } else if (figureType.equals("circle")) {
            double r = Double.parseDouble(scan.nextLine());
            area = Math.PI * r * r;
        } else if (figureType.equals("triangle")) {
            double a = Double.parseDouble(scan.nextLine());
            double h = Double.parseDouble(scan.nextLine());
            area = (a * h) / 2;
        }
        System.out.printf("%.3f", area);
    }
}
