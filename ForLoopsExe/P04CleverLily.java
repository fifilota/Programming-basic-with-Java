package ForLoopsExe;

import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int liliAge = Integer.parseInt(scan.nextLine());
        double washMachinePrice = Double.parseDouble(scan.nextLine());
        int toyPrice = Integer.parseInt(scan.nextLine());

        int toyCount =0;
        double sum = 0;
        double savedMoney = 0;

        for (int i = 1; i <=liliAge; i++) {
            if (i%2==0){
                sum += 10;
                savedMoney= savedMoney + sum -1;
            }else {
                toyCount++;
            }
        }
        double toySum = toyCount*toyPrice;
        double finalSum = toySum + savedMoney;

        if (finalSum>=washMachinePrice){
            System.out.printf("Yes! %.2f", finalSum-washMachinePrice);
        }else {
            System.out.printf("No! %.2f", washMachinePrice-finalSum);
        }
    }
}
