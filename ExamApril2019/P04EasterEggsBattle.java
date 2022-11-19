package ExamApril2019;

import java.util.Scanner;

public class P04EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int eggsOfOne = Integer.parseInt(scan.nextLine());//яйцата на първия
        int eggsOfTwo = Integer.parseInt(scan.nextLine());//яйцата на втория
        String winner = scan.nextLine();//победител

        while (!winner.equals("End")){
            if (winner.equals("one")){//ако първия победи
                eggsOfTwo-=1;//изваждаме 1 яйце от на втория
            }else {
                eggsOfOne-=1;//обратното
            }
            if (eggsOfTwo==0||eggsOfOne==0){//ако на един от двамата свършат яйцата
                break;
            }
            winner= scan.nextLine();
        }
        if (eggsOfOne==0){
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.",eggsOfTwo);
        } else if (eggsOfTwo==0) {
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.",eggsOfOne);
        }else {
            System.out.printf("Player one has %d eggs left.%n",eggsOfOne);
            System.out.printf("Player two has %d eggs left.",eggsOfTwo);
        }
    }
}
