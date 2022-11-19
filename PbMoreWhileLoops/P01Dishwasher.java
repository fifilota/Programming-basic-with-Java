package PbMoreWhileLoops;

import java.util.Scanner;

public class P01Dishwasher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int detergentBottles = Integer.parseInt(scan.nextLine());

        String command = scan.nextLine();

        int detergentMl = detergentBottles * 750;
        int detergentUsed = 0;
        int dishesCount = 0;
        int potsCount = 0;
        boolean notEnoughDet = false;
        int dishOrPotCounter = 0;

        while (!command.equals("End")) {
            int dishes = Integer.parseInt(command);
            dishOrPotCounter++;
            if (dishOrPotCounter%3==0){
                detergentUsed+=dishes*15;
                potsCount+=dishes;
            }else {
                detergentUsed+=dishes*5;
                dishesCount+=dishes;
            }
            if (detergentUsed>detergentMl){
                notEnoughDet=true;
                break;
            }

            command = scan.nextLine();
        }
        if (notEnoughDet){
            System.out.printf("Not enough detergent, %d ml. more necessary!",Math.abs(detergentUsed-detergentMl));
        }else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n",dishesCount,potsCount);
            System.out.printf("Leftover detergent %d ml.",detergentMl-detergentUsed);
        }
    }
}
