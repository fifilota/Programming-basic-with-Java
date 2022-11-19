package FirstStepsCodigExe;

import java.util.Scanner;

public class P02RadianstoDegrees {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double r = Double.parseDouble(scan.nextLine());
        double grades = (r*180)/Math.PI;

        System.out.println(grades);
    }
}
