package ExamMarch2019;

import java.util.Scanner;

public class P03Gymnastics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String country = scan.nextLine();
        String tool = scan.nextLine();

        double difficulty = 0;
        double performance = 0;

        switch (country) {
            case "Russia":
                if (tool.equals("ribbon")) {
                    difficulty = 9.100;
                    performance = 9.400;
                } else if (tool.equals("hoop")) {
                    difficulty = 9.300;
                    performance = 9.800;
                } else {
                    difficulty = 9.600;
                    performance = 9.000;
                }
                break;
            case "Bulgaria":
                if (tool.equals("ribbon")) {
                    difficulty = 9.600;
                    performance = 9.400;
                } else if (tool.equals("hoop")) {
                    difficulty = 9.550;
                    performance = 9.750;
                } else {
                    difficulty = 9.500;
                    performance = 9.400;
                }
                break;
            case "Italy":
                if (tool.equals("ribbon")) {
                    difficulty = 9.200;
                    performance = 9.500;
                } else if (tool.equals("hoop")) {
                    difficulty = 9.450;
                    performance = 9.350;
                } else {
                    difficulty = 9.700;
                    performance = 9.150;
                }
                break;
        }
        double sumRate = difficulty+performance;
        System.out.printf("The team of %s get %.3f on %s.%n",country,sumRate,tool);
        double percentToMax = (20-sumRate)/20*100;
        System.out.printf("%.2f%%",percentToMax);
    }
}
