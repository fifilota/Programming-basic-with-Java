package CondStateAdvanExe;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());

        double apartmentprice = 0;
        double studioPrice = 0;

        if (month.equals("May")||month.equals("October")){
            apartmentprice=65*nights;
            studioPrice=50*nights;
            if (nights>7 && nights<14){
                studioPrice=studioPrice*0.95;
            } else if (nights>14) {
                apartmentprice=apartmentprice*0.90;
                studioPrice=studioPrice*0.70;
            }
        } else if (month.equals("June")||month.equals("September")) {
            apartmentprice=68.70*nights;
            studioPrice=75.20*nights;
            if (nights>14){
                studioPrice=studioPrice*0.80;
                apartmentprice=apartmentprice*0.90;
            }
        } else if (month.equals("July")||month.equals("August")) {
            apartmentprice=77*nights;
            studioPrice=76*nights;
            if (nights>14){
                apartmentprice=apartmentprice*0.90;
            }
        }
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", apartmentprice,studioPrice);
    }
}
