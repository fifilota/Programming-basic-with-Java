package ExamJune2019;

import java.util.Scanner;

public class P02MovieDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int movieTime = Integer.parseInt(scan.nextLine());
        int scenes = Integer.parseInt(scan.nextLine());
        int sceneTime = Integer.parseInt(scan.nextLine());

        double preparation = movieTime*0.15;
        double neededTime = preparation+scenes*sceneTime;

        if (neededTime<=movieTime){
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!",movieTime-neededTime);
        }else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.",neededTime-movieTime);
        }
    }
}
