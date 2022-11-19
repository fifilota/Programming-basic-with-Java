package ExamJune2019;

import java.util.Scanner;

public class P03FilmPremiere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String projection = scan.nextLine();
        String packet = scan.nextLine();
        int tickets = Integer.parseInt(scan.nextLine());

        double price = 0;

        switch (projection){
            case "John Wick":
                if (packet.equals("Drink")){
                    price=12*tickets;
                } else if (packet.equals("Popcorn")) {
                    price=15*tickets;
                }else {
                    price=19*tickets;
                }
                break;
            case "Star Wars":
                if (packet.equals("Drink")){
                    price=18*tickets;
                } else if (packet.equals("Popcorn")) {
                    price=25*tickets;
                }else {
                    price=30*tickets;
                }
                if (tickets > 4) {
                    price*=0.70;
                }
                break;
            case "Jumanji":
                if (packet.equals("Drink")){
                    price=9*tickets;
                } else if (packet.equals("Popcorn")) {
                    price=11*tickets;
                }else {
                    price=14*tickets;
                }
                if (tickets==2){
                    price*=0.85;
                }
                break;
        }
        System.out.printf("Your bill is %.2f leva.",price);
    }
}
