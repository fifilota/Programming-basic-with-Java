package PbMoreFirstSteps;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double skumPrice = Double.parseDouble(scan.nextLine());
        double cacaPrice = Double.parseDouble(scan.nextLine());
        double palamudInKg = Double.parseDouble(scan.nextLine());
        double safridInKg = Double.parseDouble(scan.nextLine());
        int midiInKg = Integer.parseInt(scan.nextLine());

        double palamudPrice= skumPrice + skumPrice*0.60;
        double safridPrice = cacaPrice + cacaPrice*0.80;

        double sum = palamudPrice*palamudInKg + safridPrice*safridInKg + midiInKg*7.50;

        System.out.printf("%.2f", sum);
    }
}
