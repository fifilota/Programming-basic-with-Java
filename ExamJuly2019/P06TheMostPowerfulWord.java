package ExamJuly2019;

import java.util.Scanner;

public class P06TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        int maxPoints = 0;
        String maxPowerfulWord = "";

        while (!word.equals("End of words")) {
            int currentPoints = 0;
            for (int i = 0; i < word.length(); i++) {
                char ascii = word.charAt(i);
                currentPoints += ascii;
            }
            String letter = word.charAt(0) + "";
            switch (letter) {
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                case "Y":
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "y":
                    currentPoints *= word.length();
                    break;
                default:
                    currentPoints /= word.length();
            }
            if (currentPoints>maxPoints){
                maxPoints=currentPoints;
                maxPowerfulWord=word;
            }

            word = scan.nextLine();
        }
        System.out.printf("The most powerful word is %s - %d",maxPowerfulWord,maxPoints);
    }
}
