package ExamMarch2020;

import java.util.Scanner;

public class P05CareofPuppy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int availableFood = Integer.parseInt(scan.nextLine()); //храна в кг!!!
        int availableFoodInGr = availableFood*1000;  //Преобразуваме храната в грамове!
        int totalFoodEaten = 0; //цялата храна, изядена от кучето!

        String command = scan.nextLine(); // храна изядена на хранене в гр, докато не бъде осиновено

        while (!command.equals("Adopted")){

            int eatenFoodInGr = Integer.parseInt(command); //храна, която изяжда кучето на хранене в гр!
            totalFoodEaten+=eatenFoodInGr; // прибавяме към общо изядена храна

            command= scan.nextLine();
        }

        if (availableFoodInGr>=totalFoodEaten){ // проверяваме дали наличнаа храна е стигнала
            System.out.printf("Food is enough! Leftovers: %d grams.",availableFoodInGr-totalFoodEaten);
        }else {
            System.out.printf("Food is not enough. You need %d grams more.",totalFoodEaten-availableFoodInGr);
        }
    }
}
