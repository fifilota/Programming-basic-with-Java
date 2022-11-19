package FirstStepsCodigExe;

import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scan.nextLine());
        int fishMenu = Integer.parseInt(scan.nextLine());
        int vegMenu = Integer.parseInt(scan.nextLine());

        double sum = (chickenMenu*10.35 + fishMenu*12.40 + vegMenu*8.15)*1.20 + 2.50;

        System.out.println(sum);
    }
}
