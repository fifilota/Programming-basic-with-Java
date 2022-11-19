package ExamMarch2019;

import java.util.Scanner;

public class P02FootballResults {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String match1 = scan.nextLine();
        String match2 = scan.nextLine();
        String match3 = scan.nextLine();

        int won =0;
        int lost =0;
        int drawn =0;

        int m1Result1 = match1.charAt(0);
        int m1Result2 = match1.charAt(2);
        int m2Result1 = match2.charAt(0);
        int m2Result2 = match2.charAt(2);
        int m3Result1 = match3.charAt(0);
        int m3Result2 = match3.charAt(2);

        if (m1Result1>m1Result2){
            won++;
        } else if (m1Result1==m1Result2) {
            drawn++;
        }else {
            lost++;
        }
        if (m2Result1>m2Result2){
            won++;
        } else if (m2Result1==m2Result2) {
            drawn++;
        }else {
            lost++;
        }
        if (m3Result1>m3Result2){
            won++;
        } else if (m3Result1==m3Result2) {
            drawn++;
        }else {
            lost++;
        }
        System.out.printf("Team won %d games.%n",won);
        System.out.printf("Team lost %d games.%n",lost);
        System.out.printf("Drawn games: %d",drawn);

    }
}
