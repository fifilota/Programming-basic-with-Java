package ExamJune2019;

import java.util.Scanner;

public class P04Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int capacity = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();
        int income = 0;
        int visitorsCount =0;
        boolean isFull = false;

        while (!command.equals("Movie time!")){
            int currentSum=0;
            int visitors = Integer.parseInt(command);
            if (visitors>capacity){
                isFull=true;
                break;
            }
            capacity-=visitors;
            if (visitors%3==0){
                currentSum=visitors*5-5;
            }else {
                currentSum=visitors*5;
            }
            income+=currentSum;


            command= scan.nextLine();
        }
        if (isFull){
            System.out.println("The cinema is full.");
        }else {
            System.out.printf("There are %d seats left in the cinema.%n",capacity);
        }
        System.out.printf("Cinema income - %d lv.",income);
    }
}
