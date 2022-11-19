package MyExam29Oct;

import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();

        int adultCount = 0;
        int kidsCount = 0;
        int moneyToys = 0;
        int moneySweaters = 0;


        while (!command.equals("Christmas")) {
            int age = Integer.parseInt(command);

            if (age<=16){
                kidsCount++;
                moneyToys+=5;
            } else {
                adultCount++;
                moneySweaters+=15;
            }


            command = scan.nextLine();
        }

        System.out.printf("Number of adults: %d%n",adultCount);
        System.out.printf("Number of kids: %d%n",kidsCount);
        System.out.printf("Money for toys: %d%n",moneyToys);
        System.out.printf("Money for sweaters: %d",moneySweaters);
    }
}
