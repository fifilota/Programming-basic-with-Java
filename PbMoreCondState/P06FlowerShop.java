package PbMoreCondState;

import java.util.Scanner;

public class P06FlowerShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int magnoliesCount = Integer.parseInt(scan.nextLine());
        int  hyacinthCount = Integer.parseInt(scan.nextLine());
        int rosesCount = Integer.parseInt(scan.nextLine());
        int cactusCount = Integer.parseInt(scan.nextLine());
        double giftPrice = Double.parseDouble(scan.nextLine());

        double profit = (magnoliesCount*3.25 + hyacinthCount*4 + rosesCount*3.50 + cactusCount*8)*0.95;

        if (profit>=giftPrice){
            double diff = Math.floor(profit-giftPrice);
            System.out.printf("She is left with %.0f leva.", diff);
        }else {
            double diff = Math.ceil(giftPrice-profit);
            System.out.printf("She will have to borrow %.0f leva.", diff);
        }
  }
}
