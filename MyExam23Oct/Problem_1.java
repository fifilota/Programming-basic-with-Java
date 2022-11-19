package MyExam23Oct;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double cpuPrice = Double.parseDouble(scan.nextLine()); //usd
        double videoCardPrice = Double.parseDouble(scan.nextLine()); // usd
        double ramPrice = Double.parseDouble(scan.nextLine()); // usd
        int ramCount = Integer.parseInt(scan.nextLine());
        double discount = Double.parseDouble(scan.nextLine()); // %

        double cpuPriceLv = cpuPrice*1.57;
        double videoCardPriceLv = videoCardPrice*1.57;
        double ramPriceLv=ramPrice*1.57;
        double cpuDiscount = cpuPriceLv-cpuPriceLv*discount;
        double videoCardDiscount = videoCardPriceLv-videoCardPriceLv*discount;
        double allSum = ramPriceLv*ramCount+cpuDiscount+videoCardDiscount;
        System.out.printf("Money needed - %.2f leva.",allSum);
    }
}
