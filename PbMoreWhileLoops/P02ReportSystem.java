package PbMoreWhileLoops;

import java.util.Scanner;

public class P02ReportSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int neededSum = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();
        int allTransactionCounter= 0;
        int transactCashCount=0;
        int transactCardCount=0;
        int sumCollectCash =0;
        int sumCollectCard=0;
        int sumCollect =0;
        boolean sumIsCollected = false;


        while (!command.equals("End")) {
            allTransactionCounter++;
            int productPrice = Integer.parseInt(command);
            if (allTransactionCounter%2==0){
                if (productPrice<10){
                    System.out.println("Error in transaction!");
                }else {
                    transactCardCount++;
                    sumCollectCard+=productPrice;
                    sumCollect += productPrice;
                    System.out.println("Product sold!");
                }
            }else {
                if (productPrice>100){
                    System.out.println("Error in transaction!");
                }else {
                    transactCashCount++;
                    sumCollectCash+=productPrice;
                    sumCollect+=productPrice;
                    System.out.println("Product sold!");
                }
            }
            if (sumCollect>=neededSum){
                sumIsCollected=true;
                break;
            }

            command = scan.nextLine();
        }
        if (sumIsCollected){
            double averageCash = sumCollectCash*1.00/transactCashCount;
            double averageCard = sumCollectCard*1.00/transactCardCount;
            System.out.printf("Average CS: %.2f%n",averageCash);
            System.out.printf("Average CC: %.2f",averageCard);
        }else {
            System.out.print("Failed to collect required money for charity.");
        }
    }
}
