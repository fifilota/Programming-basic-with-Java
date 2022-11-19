package PbMoreCondState;

import java.util.Scanner;

public class P01PipesInPool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int volumPool = Integer.parseInt(scan.nextLine());
        int p1 = Integer.parseInt(scan.nextLine()); //debit na truba 1
        int p2 = Integer.parseInt(scan.nextLine());
        double n = Double.parseDouble(scan.nextLine()); // kolko h otsystva

        double stage = n*p1 + n*p2;

        if (stage>=volumPool){
            double overFlow = stage-volumPool;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", n, overFlow);

        }else {
            double percentFullness = stage*100/volumPool;
            double percentP1 = (p1*n*100)/stage;
            double percentP2 = (p2*n*100)/stage;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percentFullness, percentP1, percentP2);
        }
    }
}
