package PbMoreFirstSteps;

import java.util.Scanner;

public class WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double grades = Double.parseDouble(scan.nextLine());

        if (grades >= 26.00 && grades <= 35.00) {
            System.out.println("Hot");
        } else if (grades>=20.1 && grades<=25.9) {
            System.out.println("Warm");
        } else if (grades>=15.00 && grades<=20.00) {
            System.out.println("Mild");
        } else if (grades>=12.00 && grades<=14.9) {
            System.out.println("Cool");
        } else if (grades>=5.00 && grades<=11.9) {
            System.out.println("Cold");
        }else {
            System.out.println("unknown");
        }
    }
}
