package ExamMarch2019;

import java.util.Scanner;

public class P06BasketballTournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nameOfTournament = scan.nextLine();

        int allMatches = 0;
        int winMatchCount=0;
        int looseMatchCount =0;

        while (!nameOfTournament.equals("End of tournaments")){
            int matches = Integer.parseInt(scan.nextLine());
            int diff = 0;
            for (int i = 1; i <=matches; i++) {
                allMatches++;
                int desiTeam = Integer.parseInt(scan.nextLine());
                int opponents = Integer.parseInt(scan.nextLine());
                if (desiTeam>opponents){
                    winMatchCount++;
                    diff=Math.abs(desiTeam-opponents);
                    System.out.printf("Game %d of tournament %s: win with %d points.%n",i,nameOfTournament,diff);
                }else{
                    looseMatchCount++;
                    diff=Math.abs(desiTeam-opponents);
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n",i,nameOfTournament,diff);
                }
            }

            nameOfTournament= scan.nextLine();
        }
        double percentWins= winMatchCount*1.0/allMatches*100;
        double percentLooses = looseMatchCount*1.0/allMatches*100;
        System.out.printf("%.2f%% matches win%n",percentWins);
        System.out.printf("%.2f%% matches lost",percentLooses);

    }
}
