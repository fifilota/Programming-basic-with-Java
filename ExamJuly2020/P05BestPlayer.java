package ExamJuly2020;

import java.util.Scanner;

public class P05BestPlayer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();//име на играча до командата ЕНД

        int maxGoals = Integer.MIN_VALUE;//намираме този с най-много голове
        boolean hattrick = false;
        String bestPlayerName= "";//тук ще запазим името на най-добрия играч

        while (!command.equals("END")){
            String namePlayer = command;
            int goals = Integer.parseInt(scan.nextLine());//голове
            if (goals>maxGoals){//проверяваме настоящите голове са най-много
                maxGoals=goals;
                bestPlayerName=namePlayer;//запазваме си името на последно прочетения играч, който ще е с най-много голове до момента
            }
            if (goals>=3){//проверяваме за хетрик
                hattrick=true;
            }
            if (goals>=10) {//проверяваме дали головете са повече от 10
                break;
            }


            command= scan.nextLine();
        }
        System.out.printf("%s is the best player!%n",bestPlayerName);
        if (hattrick){
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n",maxGoals);
        }else {
            System.out.printf("He has scored %d goals.",maxGoals);
        }
    }
}
