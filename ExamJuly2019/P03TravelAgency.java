package ExamJuly2019;

import java.util.Scanner;

public class P03TravelAgency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String city = scan.nextLine();
        String packet = scan.nextLine();
        String vip = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());
        double price =0;
        double sum =0;
        boolean invalid = false;

        switch (city){
            case "Bansko":
            case "Borovets":
                if (packet.equals("withEquipment")){
                    price=100;
                    if (vip.equals("yes")){
                        price*=0.90;
                    }
                }else if (packet.equals("noEquipment")){
                    price=80;
                    if (vip.equals("yes")){
                        price*=0.95;
                    }
                }else {
                    invalid=true;
                }
                if (days>7){
                    sum=price*(days-1);
                }else {
                    sum=price*days;
                }
                break;
            case "Varna":
            case "Burgas":
                if (packet.equals("withBreakfast")){
                    price=130;
                    if (vip.equals("yes")){
                        price*=0.88;
                    }
                }else if (packet.equals("noBreakfast")) {
                    price = 100;
                    if (vip.equals("yes")){
                        price*=0.93;
                    }
                }else {
                    invalid=true;
                }
                if (days>7){
                    sum=price*(days-1);
                }else {
                    sum=price*days;
                }
                break;
            default:
                invalid=true;
                break;
        }
        if (invalid){
            System.out.println("Invalid input!");
        }else if (days<1){
            System.out.println("Days must be positive number!");
        }else {
            System.out.printf("The price is %.2flv! Have a nice time!",sum);
        }
    }
}
