package Exam6and7April2019;

import java.util.Scanner;

public class P03Oscarsweekincinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String movie = scan.nextLine();
        String salon = scan.nextLine();
        int tickets = Integer.parseInt(scan.nextLine());

        double price =0;

        switch (movie){
            case "A Star Is Born":
                if (salon.equals("normal")){
                    price=7.50*tickets;
                } else if (salon.equals("luxury")) {
                    price=10.50*tickets;
                }else {
                    price=13.50*tickets;
                }
                break;
            case "Bohemian Rhapsody":
                if (salon.equals("normal")){
                    price=7.35*tickets;
                } else if (salon.equals("luxury")) {
                    price=9.45*tickets;
                }else {
                    price=12.75*tickets;
                }
                break;
            case "Green Book":
                if (salon.equals("normal")){
                    price=8.15*tickets;
                } else if (salon.equals("luxury")) {
                    price=10.25*tickets;
                }else {
                    price=13.25*tickets;
                }
                break;
            case "The Favourite":
                if (salon.equals("normal")){
                    price=8.75*tickets;
                } else if (salon.equals("luxury")) {
                    price=11.55*tickets;
                }else {
                    price=13.95*tickets;
                }
                break;
        }
        System.out.printf("%s -> %.2f lv.",movie,price);
    }
}
