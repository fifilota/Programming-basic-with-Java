package ForLoopsLab;

import java.util.Scanner;

public class P05CharacterSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        int lengthText = text.length();

        for (int i = 0; i <lengthText; i++) {
            char letter = text.charAt(i);
            System.out.println(letter);
        }
    }
}
