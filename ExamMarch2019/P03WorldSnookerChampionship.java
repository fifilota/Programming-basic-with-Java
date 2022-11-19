package ExamMarch2019;

import java.util.Scanner;

public class P03WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String stage = scan.nextLine();
        String ticketType = scan.nextLine();
        int tickets = Integer.parseInt(scan.nextLine());
        String photo = scan.nextLine();

        double ticketPrice =0;

        switch (stage){
            case "Quarter final":
                if (ticketType.equals("Standard")){
                    ticketPrice=55.50;
                } else if (ticketType.equals("Premium")) {
                    ticketPrice=105.20;
                }else {
                    ticketPrice=118.90;
                }
                break;
            case "Semi final":
                if (ticketType.equals("Standard")){
                    ticketPrice=75.88;
                } else if (ticketType.equals("Premium")) {
                    ticketPrice=125.22;
                }else {
                    ticketPrice=300.40;
                }
                break;
            case "Final":
                if (ticketType.equals("Standard")){
                    ticketPrice=110.10;
                } else if (ticketType.equals("Premium")) {
                    ticketPrice=160.66;
                }else {
                    ticketPrice=400;
                }
                break;
        }
        double sum = ticketPrice*tickets;

        if (sum>4000){
           sum*=0.75;
        } else if (sum>2500) {
            sum*=0.90;
            if (photo.equals("Y")){
                sum+=40*tickets;
            }
        }else {
            if (photo.equals("Y")){
                sum+=40*tickets;
            }
        }
        System.out.printf("%.2f",sum);


    }
}
