package ExamMarch2019;

import java.util.Scanner;

public class P01TennisEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tennisRaketa = Double.parseDouble(scan.nextLine());
        int tenisRaketiBr = Integer.parseInt(scan.nextLine());
        int maratonki = Integer.parseInt(scan.nextLine());

        double tenisRaketiSum = tenisRaketiBr*tennisRaketa;
        double maratonkiPrice = tennisRaketa/6;
        double maratonkiSum = maratonki*maratonkiPrice;
        double sum = tenisRaketiSum+maratonkiSum;
        double otherEquip = sum*0.20;
        double finalSum = sum+otherEquip;
        double priceDjoko = finalSum/8;
        double priceSponsor = finalSum*7/8;

        System.out.printf("Price to be paid by Djokovic %.0f%n",Math.floor(priceDjoko));
        System.out.printf("Price to be paid by sponsors %.0f",Math.ceil(priceSponsor));
    }
}
