package CondStateAdvanLab;

import java.util.Scanner;

public class P08CinemaTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String dayOfWeek = scan.nextLine();

        int price = 0;

        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Friday")) {
            price = 12;
        } else if (dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday")) {
            price = 14;
        } else {
            price = 16;
        }
        System.out.println(price);
    }
}
