package ExamApril2019;

import java.util.Scanner;

public class P05EasterEggs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int eggsPainted = Integer.parseInt(scan.nextLine());//боядисани яйца

       int redEggsCount= 0;
       int orangeEggsCount =0;
       int blueEggsCount =0;
       int greenEggsCount =0;

        for (int i = 1; i <=eggsPainted; i++) {//за всяко яйце
            String color = scan.nextLine();//четем цвят
            switch (color){
                case "red":
                    redEggsCount++;
                    break;
                case "orange":
                    orangeEggsCount++;
                    break;
                case "blue":
                    blueEggsCount++;
                    break;
                case "green":
                    greenEggsCount++;
                    break;
            }
        }
        int maxPaint= Math.max(redEggsCount,Math.max(orangeEggsCount,Math.max(blueEggsCount,greenEggsCount)));//намиране на най-голям брой от 4те
        //цвята, като влагаме едно вдруго, понеже може само с 2 стойности - внимаваме в скобите!
        String colorMaxEggs ="";//ще запазим този цвят с най-много яйца
        if (maxPaint==redEggsCount){
            colorMaxEggs="red";
        } else if (maxPaint==orangeEggsCount) {
            colorMaxEggs="orange";
        } else if (maxPaint==blueEggsCount) {
            colorMaxEggs="blue";
        } else {
            colorMaxEggs = "green";
        }

            System.out.printf("Red eggs: %d%n",redEggsCount);
            System.out.printf("Orange eggs: %d%n",orangeEggsCount);
            System.out.printf("Blue eggs: %d%n",blueEggsCount);
            System.out.printf("Green eggs: %d%n",greenEggsCount);
            System.out.printf("Max eggs: %d -> %s",maxPaint,colorMaxEggs);

    }
}
