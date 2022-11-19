package MyExam23Oct;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int daysOut = Integer.parseInt(scan.nextLine());
        int kgAllFood = Integer.parseInt(scan.nextLine());
        double reender1FoodDay = Double.parseDouble(scan.nextLine());
        double reender2FoodDay = Double.parseDouble(scan.nextLine());
        double reender3FoodDay = Double.parseDouble(scan.nextLine());

        double reender1FoodNeeded = reender1FoodDay*daysOut;
        double reender2FoodNeeded = reender2FoodDay*daysOut;
        double reender3FoodNeeded = reender3FoodDay*daysOut;
        double allFoodNeeded = reender1FoodNeeded+reender2FoodNeeded+reender3FoodNeeded;

        if (kgAllFood>=allFoodNeeded){
            double diff = Math.floor(kgAllFood-allFoodNeeded);
            System.out.printf("%.0f kilos of food left.", diff);
        }else {
            double diff = Math.ceil(allFoodNeeded-kgAllFood);
            System.out.printf("%.0f more kilos of food are needed.", diff);
        }
    }
}
