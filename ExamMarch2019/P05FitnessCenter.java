package ExamMarch2019;

import java.util.Scanner;

public class P05FitnessCenter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int visitors = Integer.parseInt(scan.nextLine());
        int back =0;
        int chest =0;
        int legs = 0;
        int abs =0;
        int proteinShake =0;
        int proteinBar =0;
        int workOut =0;


        for (int i = 1; i <=visitors; i++) {
            String action = scan.nextLine();
            switch (action){
                case "Back":
                    back++;
                    workOut++;
                    break;
                case "Chest":
                    chest++;
                    workOut++;
                    break;
                case "Legs":
                    legs++;
                    workOut++;
                    break;
                case "Abs":
                    abs++;
                    workOut++;
                    break;
                case "Protein shake":
                    proteinShake++;
                    break;
                case "Protein bar":
                    proteinBar++;
                    break;
            }
        }
        System.out.printf("%d - back%n",back);
        System.out.printf("%d - chest%n",chest);
        System.out.printf("%d - legs%n",legs);
        System.out.printf("%d - abs%n",abs);
        System.out.printf("%d - protein shake%n",proteinShake);
        System.out.printf("%d - protein bar%n",proteinBar);
        System.out.printf("%.2f%% - work out%n",workOut*1.0/visitors*100);
        System.out.printf("%.2f%% - protein",(proteinBar+proteinShake)*1.0/visitors*100);
    }
}
