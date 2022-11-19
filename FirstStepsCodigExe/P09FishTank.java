package FirstStepsCodigExe;

import java.util.Scanner;

public class P09FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int l = Integer.parseInt(scan.nextLine());
        int w = Integer.parseInt(scan.nextLine());
        int h = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine())/100;

        double volFigure= l*w*h;
        double volFinal = volFigure - volFigure*percent;
        double liters = volFinal*0.001;

        System.out.println(liters);
    }
}
