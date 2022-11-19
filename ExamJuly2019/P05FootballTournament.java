package ExamJuly2019;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class P05FootballTournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String team = scan.nextLine();
        int matches = Integer.parseInt(scan.nextLine());
        int points =0;
        int w =0;
        int d=0;
        int l =0;


        for (int i = 1; i <=matches ; i++) {
            String result = scan.nextLine();
            switch (result){
                case "W":
                    w++;
                    points+=3;
                    break;
                case "D":
                    d++;
                    points+=1;
                    break;
                case "L":
                    l++;
                    break;
            }
        }
        if (matches==0){
            System.out.printf("%s hasn't played any games during this season.",team);
        }else {
            System.out.printf("%s has won %d points during this season.%n", team,points);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n",w);
            System.out.printf("## D: %d%n",d);
            System.out.printf("## L: %d%n",l);
            System.out.printf("Win rate: %.2f%%",w*1.0/matches*100);

        }
    }
}
