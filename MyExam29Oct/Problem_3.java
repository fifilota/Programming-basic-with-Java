package MyExam29Oct;

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String race = scan.nextLine();
        String gender = scan.nextLine();

        int years = 0;

        switch (race) {
            case "British Shorthair":
                if (gender.equals("m")) {
                    years = 13;
                } else {
                    years = 14;
                }
                break;
            case "Siamese":
                if (gender.equals("m")) {
                    years = 15;
                } else {
                    years = 16;
                }
                break;
            case "Persian":
                if (gender.equals("m")) {
                    years = 14;
                } else {
                    years = 15;
                }
                break;
            case "Ragdoll":
                if (gender.equals("m")) {
                    years = 16;
                } else {
                    years = 17;
                }
                break;
            case "American Shorthair":
                if (gender.equals("m")) {
                    years = 12;
                } else {
                    years = 13;
                }
                break;
            case "Siberian":
                if (gender.equals("m")) {
                    years = 11;
                } else {
                    years = 12;
                }
                break;
            default:
                System.out.printf("%s is invalid cat!", race);
                return;
        }
        double months = years*12;
        double catMonths = Math.round(months/6);

        System.out.printf("%.0f cat months",catMonths);
    }
}
