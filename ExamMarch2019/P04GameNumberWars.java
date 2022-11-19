package ExamMarch2019;

import java.util.Scanner;

public class P04GameNumberWars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String gamer1 = scan.nextLine();
        String gamer2 = scan.nextLine();
        boolean numberWars = false;
        int points1 = 0;
        int points2 = 0;
        String winner="";
        int pointsWinner=0;

        String command = scan.nextLine();

        while (!command.equals("End of game")){
            int card1 = Integer.parseInt(command);
            int card2 = Integer.parseInt(scan.nextLine());
            if (card1==card2){
                card1=Integer.parseInt(scan.nextLine());
                card2=Integer.parseInt(scan.nextLine());
                if (card1>card2){
                    pointsWinner=points1;
                    winner=gamer1;
                    numberWars=true;
                    break;
                }else {
                    pointsWinner=points2;
                    winner=gamer2;
                    numberWars=true;
                    break;
                }
            }else {
                if (card1>card2){
                    points1+=card1-card2;
                }else {
                    points2+=card2-card1;
                }
            }

            command= scan.nextLine();
        }

        if (numberWars){
            System.out.println("Number wars!");
            System.out.printf("%s is winner with %d points",winner,pointsWinner);
        }else {
            System.out.printf("%s has %d points%n",gamer1,points1);
            System.out.printf("%s has %d points%n",gamer2,points2);
        }
    }
}
