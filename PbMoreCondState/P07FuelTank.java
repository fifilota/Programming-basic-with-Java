package PbMoreCondState;

import java.util.Scanner;

public class P07FuelTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fuelType = scan.nextLine();
        double fuelInR = Double.parseDouble(scan.nextLine());
        fuelType=fuelType.toLowerCase();

        if (fuelType.equals("diesel") || fuelType.equals("gasoline") || fuelType.equals("gas")) {
                if (fuelInR >= 25) {
                    System.out.printf("You have enough %s.", fuelType);
                } else {
                    System.out.printf("Fill your tank with %s!", fuelType);
                }
            }else {
                System.out.println("Invalid fuel!");
            }
    }
}
