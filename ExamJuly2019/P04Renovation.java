package ExamJuly2019;

import java.util.Scanner;

public class P04Renovation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = Integer.parseInt(scan.nextLine());
        int w = Integer.parseInt(scan.nextLine());
        int notToPaint = Integer.parseInt(scan.nextLine()); // percent!
        String command = scan.nextLine();
        double toPaint = Math.ceil(h*w*4-h*w*4*(notToPaint*1.0/100));
        boolean allPainted = false;


        while (!command.equals("Tired!")){
            int paint = Integer.parseInt(command); // litters
            toPaint=toPaint - paint;
            if (toPaint<=0){
                allPainted=true;
                break;
            }

            command= scan.nextLine();
        }

        if (command.equals("Tired!")){
            System.out.printf("%.0f quadratic m left.",toPaint);
        }
        if (allPainted){
            if (toPaint==0){
                System.out.println("All walls are painted! Great job, Pesho!");
            }else {
                System.out.printf("All walls are painted and you have %.0f l paint left!",Math.abs(toPaint));
            }
        }


    }
}
