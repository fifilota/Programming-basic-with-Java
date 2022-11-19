package MyExam29Oct;

import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <=n; i++) {
            double avgGoldDay = Double.parseDouble(scan.nextLine()); // estimated
            int days = Integer.parseInt(scan.nextLine());
            double goldOfAllDays = 0;
            for (int j = 1; j <=days ; j++) {
                double goldMinedOfDay= Double.parseDouble(scan.nextLine());
                goldOfAllDays+=goldMinedOfDay;
            }
            double realAvgGoldDay = goldOfAllDays/days;
            if (realAvgGoldDay>=avgGoldDay){
                System.out.printf("Good job! Average gold per day: %.2f.%n",realAvgGoldDay);
            }else {
                System.out.printf("You need %.2f gold.%n",avgGoldDay-realAvgGoldDay);
            }
            
        }
    }
}
