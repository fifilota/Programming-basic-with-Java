package ExamJune2019;

import java.util.Scanner;

public class P06FavoriteMovie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String filmName = scan.nextLine();
        int filmCount = 0;
        String bestFilm = "";
        int maxPoints = 0;
        boolean limit = false;

        while (!filmName.equals("STOP")) {
            filmCount++;
            int lengthOfFilmName = filmName.length();
            int currenPoints = 0;
            for (int i = 0; i < lengthOfFilmName; i++) {
                int ascii =(int) filmName.charAt(i);
                if (ascii >= 65 && ascii <= 90) {
                    currenPoints += ascii - lengthOfFilmName;
                } else if (ascii >= 97 && ascii <= 122) {
                    currenPoints +=ascii - (2 * lengthOfFilmName);
                } else {
                    currenPoints+=ascii;
                }
                if (currenPoints > maxPoints) {
                    maxPoints = currenPoints;
                    bestFilm = filmName;
                }
            }
            if (filmCount == 7) {
                limit = true;
                break;
            }

            filmName = scan.nextLine();
        }
        if (limit) {
            System.out.printf("The limit is reached.%n");
            System.out.printf("The best movie for you is %s with %d ASCII sum.", bestFilm, maxPoints);
        } else {
            System.out.printf("The best movie for you is %s with %d ASCII sum.", bestFilm, maxPoints);
        }
    }
}
