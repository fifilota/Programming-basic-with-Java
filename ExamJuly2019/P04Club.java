package ExamJuly2019;

import java.util.Scanner;

public class P04Club {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double target = Double.parseDouble(scan.nextLine());
        double income = 0.0;
        while (true){
            String cocktailName = scan.nextLine();
            if (cocktailName.equals("Party!")){
                System.out.printf("We need %.2f leva more.%n",target);
                System.out.printf("Club income - %.2f leva.",income);
                break;
            }
            int cocktailCount = Integer.parseInt(scan.nextLine());
            int price = cocktailCount * cocktailName.length();
            double finaPrice = price;
            if (price%2!=0){
                finaPrice*=0.75;
            }
            income+=finaPrice;
            target-=finaPrice;
            if (target<=0){
                System.out.println("Target acquired.");
                System.out.printf("Club income - %.2f leva.",income);
                break;
            }
        }
    }
}
