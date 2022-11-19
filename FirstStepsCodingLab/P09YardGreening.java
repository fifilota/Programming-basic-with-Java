package FirstStepsCodingLab;

import java.util.Scanner;

public class P09YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double area = Double.parseDouble(scan.nextLine());

        double sum = area*7.61;
        double discount = sum*0.18;
        double finalSum = sum-discount;

        System.out.printf("The final price is: %.2f lv.", finalSum);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
