package ExamMarch2020;

import java.util.Scanner;

public class P02CatWalking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int walkInMin = Integer.parseInt(scan.nextLine()); // минути на разходка
        int walkCount = Integer.parseInt(scan.nextLine()); // брой разходки
        int calories = Integer.parseInt(scan.nextLine()); // калории, поети за деня

        double burntCalories = walkInMin*walkCount*5; //изчисляваме колко калории ще изгори котката от подадемите данни
        // (минути на разходка * брой разходки * 5)
        double neededBurntCalories = calories*1.0/2; // трябва да изгори поне половината от поетите калории

        if (burntCalories>=neededBurntCalories){ // ако изгорените калории са повече или равни на 50%
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %.0f.",burntCalories);
        }else { // ако са по-малко
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %.0f.",burntCalories);
        } // това закръгляне до най-близко цяло число е с %.0f! А може и с инт да го направим...

    }
}
