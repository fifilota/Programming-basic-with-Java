package WhileLoopsExe;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double vacationCost = Double.parseDouble(scan.nextLine());
        double availableAmount = Double.parseDouble(scan.nextLine());
        int spendingDaysCount = 0;
        int allDaysCount = 0;

        while (availableAmount < vacationCost && spendingDaysCount < 5) {
            allDaysCount++;
            String action = scan.nextLine();
            double sum = Double.parseDouble(scan.nextLine());
            switch (action) {
                case "spend":
                    availableAmount -= sum;
                    spendingDaysCount++;
                    if (sum >= availableAmount) {
                        availableAmount = 0;
                    }
                    break;
                case "save":
                    availableAmount += sum;
                    spendingDaysCount = 0;
                    break;
            }
        }
        if (spendingDaysCount>=5){
            System.out.println("You can't save the money.");
            System.out.printf("%d",allDaysCount);
        }else {
            System.out.printf("You saved the money for %d days.",allDaysCount);
        }
    }
}