package MyExam29Oct;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int paintBoxes = Integer.parseInt(scan.nextLine());
        int wallpapersRolls = Integer.parseInt(scan.nextLine());
        double glovesPrice = Double.parseDouble(scan.nextLine());
        double brushPrice = Double.parseDouble(scan.nextLine());

        double gloves = Math.ceil(wallpapersRolls*0.35);
        double brushes = Math.floor(paintBoxes*0.48);
        double glovesSum = gloves*glovesPrice;
        double brushesSum = brushes*brushPrice;
        double paintSum = paintBoxes*21.50;
        double wallpapersSum = wallpapersRolls*5.20;
        double allSum = glovesSum+brushesSum+paintSum+wallpapersSum;
        double deliveryPrice = allSum/15;

        System.out.printf("This delivery will cost %.2f lv.",deliveryPrice);

    }
}
