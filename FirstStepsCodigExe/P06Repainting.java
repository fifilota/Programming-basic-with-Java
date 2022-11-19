package FirstStepsCodigExe;

import java.util.Scanner;

public class P06Repainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nylon = Integer.parseInt(scan.nextLine()); // kv.m
        int paint = Integer.parseInt(scan.nextLine()); // l
        int paintThinner = Integer.parseInt(scan.nextLine()); // l
        int hoursWorking = Integer.parseInt(scan.nextLine());

        double cost = nylon*1.50 + paint*14.50 + paintThinner*5 + paint*14.50*0.10 + 2*1.50 + 0.40;
        double finalCost = cost + hoursWorking*(cost*0.30);

        System.out.println(finalCost);

    }
}
