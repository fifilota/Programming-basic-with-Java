package FirstStepsCodingLab;

import java.util.Scanner;

public class P06ConcatenateData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

      //  "You are <firstName> <lastName>, a <age>-years old person from <town>."
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String town = scan.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, town);
    }
}
