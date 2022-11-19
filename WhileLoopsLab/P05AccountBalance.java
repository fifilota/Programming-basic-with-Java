package WhileLoopsLab;

import java.util.Scanner;

public class P05AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();

        double total =0;
        boolean invalid = false;
        while (!command.equals("NoMoreMoney")){
            double amount = Double.parseDouble(command);
            if (amount<0){
                invalid=true;
                break;
            }
            System.out.printf("Increase: %.2f%n",amount);
            total+=amount;
            command= scan.nextLine();
        }
        if (invalid){
            System.out.println("Invalid operation!");
            System.out.printf("Total: %.2f",total);
        }else {
            System.out.printf("Total: %.2f",total);
        }
    }
}
