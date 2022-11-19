package FirstStepsCodingLab;

import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dogFoodC = Integer.parseInt(scan.nextLine());
        int catFoodC = Integer.parseInt(scan.nextLine());
        double dogFoodPrice = dogFoodC*2.50;
        double catFoodPrice = catFoodC*4;
        double sum = dogFoodPrice+catFoodPrice;

        System.out.printf("%.1f lv.", sum);
    }
}
