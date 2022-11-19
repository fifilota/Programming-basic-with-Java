package ExamApril2019;

import java.util.Scanner;

public class P03PaintingEggs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String size = scan.nextLine();
        String color = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());

        double price = 0;
        switch (size){
            case"Large":
                if (color.equals("Red")){
                    price=16;
                } else if (color.equals("Green")) {
                    price=12;
                } else if (color.equals("Yellow")) {
                    price=9;
                }
                break;
            case "Medium":
                if (color.equals("Red")){
                    price=13;
                } else if (color.equals("Green")) {
                    price=9;
                } else if (color.equals("Yellow")) {
                    price=7;
                }
                break;
            case "Small":
                if (color.equals("Red")){
                    price=9;
                } else if (color.equals("Green")) {
                    price=8;
                } else if (color.equals("Yellow")) {
                    price=5;
                }
                break;
        }
        double allSum = count*price;
        double costs = allSum*0.35;
        double finalSum = allSum - costs;

        System.out.printf("%.2f leva.",finalSum);
    }
}
