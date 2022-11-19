package ExamJune2019;

import java.util.Scanner;

public class P05Oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

                String actorName = scan.nextLine();
                double points = Double.parseDouble(scan.nextLine());
                int juryCount = Integer.parseInt(scan.nextLine());

                boolean nomination = false;
                for (int i = 1; i <=juryCount; i++) {
                    String juryName = scan.nextLine();
                    double pointFromJury = Double.parseDouble(scan.nextLine());
                    points= points + ((juryName.length()*pointFromJury)/2);

                    if (points>=1250.5){
                        nomination=true;
                        break;
                    }
                }
                if (nomination){
                    System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, points);
                }else {
                    System.out.printf("Sorry, %s you need %.1f more!", actorName,1250.5-points);
                }
            }
        }


