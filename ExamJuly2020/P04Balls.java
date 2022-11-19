package ExamJuly2020;

import java.util.Scanner;

public class P04Balls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine()); // н на брой топки

        double totalPoints=0; // всички получени точки
        int redBallsCount= 0;//каунтер за червените и т.н.
        int orangeBallsCount =0;
        int yellowBallsCount =0;
        int whiteBallsCount =0;
        int otherColor=0;
        int dividesBlackBalls =0;
        for (int i = 1; i <=n; i++) {//от първата до последната топка
            String color = scan.nextLine();//цвета на топката

            switch (color){//според цвета
                case "red":
                    redBallsCount++;
                    totalPoints+=5;
                    break;
                case "orange":
                    orangeBallsCount++;
                    totalPoints+=10;
                    break;
                case "yellow":
                    yellowBallsCount++;
                    totalPoints+=15;
                    break;
                case "white":
                    whiteBallsCount++;
                    totalPoints+=20;
                    break;
                case "black":
                    dividesBlackBalls++;
                    totalPoints=Math.floor(totalPoints/2);
                    break;
                default:
                    otherColor++;
                    continue;//продължаваме цикъла
            }
        }
        System.out.printf("Total points: %.0f%n",totalPoints);
        System.out.printf("Red balls: %d%n",redBallsCount);
        System.out.printf("Orange balls: %d%n",orangeBallsCount);
        System.out.printf("Yellow balls: %d%n",yellowBallsCount);
        System.out.printf("White balls: %d%n",whiteBallsCount);
        System.out.printf("Other colors picked: %d%n",otherColor);
        System.out.printf("Divides from black balls: %d",dividesBlackBalls);
    }
}
