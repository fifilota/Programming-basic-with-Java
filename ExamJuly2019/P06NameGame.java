package ExamJuly2019;

import java.util.Scanner;

public class P06NameGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        int maxPoits = Integer.MIN_VALUE;
        String winner = "";

        while (!command.equals("Stop")){
            String name = command;
            int currentPoints=0;
            for (int i = 0; i <name.length(); i++) {
                int number = Integer.parseInt(scan.nextLine());
                int ascii = (int) name.charAt(i);
                if (number==ascii){
                    currentPoints+=10;
                }else {
                    currentPoints+=2;
                }
            }
            if (currentPoints>=maxPoits){
                maxPoits=currentPoints;
                winner=name;
            }

            command= scan.nextLine();
            currentPoints=0;
        }
        System.out.printf("The winner is %s with %d points!",winner,maxPoits);
    }
}
