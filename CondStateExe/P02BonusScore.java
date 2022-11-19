package CondStateExe;

import java.util.Scanner;

public class P02BonusScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int points = Integer.parseInt(scan.nextLine());
        double bonusPoints = 0;

        if (points<=100){
            bonusPoints=5;
        } else if (points<=1000) {
            bonusPoints=points*0.20;
        }else {
            bonusPoints=points*0.10;
        }

        if (points%2==0){
            bonusPoints=bonusPoints+1;
        }
        if (points%10==5){
            bonusPoints=bonusPoints+2;
        }
        double totalPoints= points+bonusPoints;

        System.out.println(bonusPoints);
        System.out.println(totalPoints);
    }
}
