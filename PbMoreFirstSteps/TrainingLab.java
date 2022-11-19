package PbMoreFirstSteps;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double w = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        int cols = (int) ((h - 1) / 0.70);
        int rows = (int) (w / 1.20);
        int seats = (cols * rows) - 3;

        System.out.println(seats);
    }
}

//        double a_w = w/1.20; //делим целочислено (тоест резултата е без остатъка)
//        double a_w2= w%1.20;//делим с остатък(тоест резултата е само остатъка)
//        double b_h = (h-1)/0.70;//същото за "х"
//        double b_h2 = (h-1)%0.70;//същото за "х"
//        double a_w3 = a_w-a_w2;//изваждаме от целочисленото това с остатък, защото иначе после остатъка се начислява,
//        // нищо че не се вижда!!!
//        double b_h3 = b_h-b_h2;//същото за "х"
//        double workinSpace = (a_w3*b_h3)-3;
//        if (a_w2*b_h2==0.84){
//            workinSpace++;
//        }
//        System.out.printf("%.0f", workinSpace);




