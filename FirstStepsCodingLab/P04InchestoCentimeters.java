package FirstStepsCodingLab;

import java.util.Scanner;

public class P04InchestoCentimeters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double inches = Double.parseDouble(scan.nextLine());
        double centimeters = inches*2.54;

        System.out.println(centimeters);
    }
}
