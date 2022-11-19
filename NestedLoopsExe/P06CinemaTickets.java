package NestedLoopsExe;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String command = scan.nextLine();

        int countTotalTickets=0;
        int countStandart =0;
        int countKids=0;
        int countStudent=0;
        while (!command.equals("Finish")) {
            String movie = command;
            int seats = Integer.parseInt(scan.nextLine());
            int countCurrentTicket=0;
            String ticketType= scan.nextLine();
            while (!ticketType.equals("End")){
                countCurrentTicket++;
                countTotalTickets++;
                if (ticketType.equals("student")){
                    countStudent++;
                } else if (ticketType.equals("standard")) {
                    countStandart++;
                } else if (ticketType.equals("kid")) {
                    countKids++;
                }
                if (countCurrentTicket>=seats){
                    break;
                }
                ticketType= scan.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n",movie,countCurrentTicket*1.00/seats*100);

            command = scan.nextLine();
        }
        System.out.printf("Total tickets: %d%n",countTotalTickets);
        System.out.printf("%.2f%% student tickets.%n",countStudent*1.0/countTotalTickets*100);
        System.out.printf("%.2f%% standard tickets.%n",countStandart*1.0/countTotalTickets*100);
        System.out.printf("%.2f%% kids tickets.",countKids*1.0/countTotalTickets*100);
    }
}
