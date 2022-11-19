package FirstStepsCodingLab;

import java.util.Scanner;

public class P05GreetingbyName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        System.out.println("Hello, " + name +"!");
    }
}
