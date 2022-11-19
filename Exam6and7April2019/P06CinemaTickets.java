package Exam6and7April2019;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String movieName = scan.nextLine();//име на филм

        int studentTicket =0;//каунтери за видовете билети
        int standartTicket =0;
        int kidTicket =0;

        while (!movieName.equals("Finish")){//до команда финиш, четем филм
            int freeSeats = Integer.parseInt(scan.nextLine());//свободни места за съответния филм
            int movieTicketCount=0;//закупени билети за съответния филм
            for (int i = 0; i <freeSeats; i++) {//за всяко отделно място четем:
                String ticket = scan.nextLine();//вид билет
                if (ticket.equals("End")){//дали са свършили билетите
                break;
                }else {
                    movieTicketCount++;//ако не инкре. билетите за съотв.филм
                }
                switch (ticket){//суичваме по видовете билети
                    case "student":
                        studentTicket++;
                        break;
                    case "standard":
                        standartTicket++;
                        break;
                    case "kid":
                        kidTicket++;
                        break;
                }
            }
            //принтираме за съотв.филм-име,заетост на залата
                System.out.printf("%s - %.2f%% full.%n",movieName,movieTicketCount*1.0/freeSeats*100);
            movieName= scan.nextLine();
        }
        int totalTickets = studentTicket+standartTicket+kidTicket;//извън 2та цикъла смятаме общо всички билети
        System.out.printf("Total tickets: %d%n",totalTickets);
        System.out.printf("%.2f%% student tickets.%n",studentTicket*1.0/totalTickets*100);
        System.out.printf("%.2f%% standard tickets.%n",standartTicket*1.0/totalTickets*100);
        System.out.printf("%.2f%% kids tickets.%n",kidTicket*1.0/totalTickets*100);
    }
}

//Podobno reshenie
//import java.util.Scanner;
//
//public class Demo {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int students = 0;
//        int standard = 0;
//        int kids = 0;
//
//        String filmName = scan.nextLine();
//        while (!"Finish".equals(filmName)) {
//            int places = Integer.parseInt(scan.nextLine());
//            int people = 0;
//            for (int i = 0; i < places; i++) {
//                String command = scan.nextLine();
//                if ("student".equals(command)) {
//                    students++;
//                } else if ("standard".equals(command)) {
//                    standard++;
//                } else if ("kid".equals(command)) {
//                    kids++;
//                } else if ("End".equals(command)) {
//                    break;
//                }
//                people++;
//            }
//            System.out.println(String.format("%s - %.2f%% full.", filmName, people * 1.0 / places * 100));
//            filmName = scan.nextLine();
//        }
//        int totalTickets = standard + students + kids;
//        System.out.println(String.format("Total tickets: %d", totalTickets));
//        System.out.println(String.format("%.2f%% student tickets.", (students * 1.0 / totalTickets * 100)));
//        System.out.println(String.format("%.2f%% standard tickets.", (standard * 1.0 / totalTickets * 100)));
//        System.out.println(String.format("%.2f%% kids tickets.", (kids * 1.0 / totalTickets * 100)));
//    }
//}

