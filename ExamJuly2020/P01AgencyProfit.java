package ExamJuly2020;

import java.util.Scanner;

public class P01AgencyProfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String airLine = scan.nextLine(); //име на авиокомпанията
        int ticketAdults = Integer.parseInt(scan.nextLine()); //брой билети за възрастни
        int ticketsKids = Integer.parseInt(scan.nextLine());//брой детски билети
        double ticketAdultPrice = Double.parseDouble(scan.nextLine());//цена билет за възрастен
        double fee = Double.parseDouble(scan.nextLine());//такса обслужване на авиокомпанията

        double ticketKidPrice=ticketAdultPrice*0.30+fee;//изчисляваме цената на детския билет
        double finalTicketAdultPrice = ticketAdultPrice+fee;//прибавяме и таксата към билета за възрастен
        double allSales = finalTicketAdultPrice*ticketAdults + ticketKidPrice*ticketsKids;//изчисляваме общата сума на продадените билети
        double profit = allSales*0.20;//изчисляваме печалбата на авиокомпанията

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",airLine,profit);
    }
}
