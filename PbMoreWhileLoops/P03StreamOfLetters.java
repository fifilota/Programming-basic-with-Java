package PbMoreWhileLoops;

import java.util.Scanner;

public class P03StreamOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

           String text = scan.nextLine();

           int counterC = 0;
           int counterO=0;
           int counterN =0;
           int letterPassed =0;
           String word ="";


           while (!text.equals("End")){
                char symbol = text.charAt(0);
                if (Character.isLetter(symbol)) {
                    if (text.equals("c") && counterC == 0) {
                        counterC++;
                        letterPassed++;
                    } else if (text.equals("o") && counterO == 0) {
                        counterO++;
                        letterPassed++;
                    } else if (text.equals("n") && counterN == 0) {
                        counterN++;
                        letterPassed++;
                    } else {
                        word = word + symbol;
                    }
                }

                if (letterPassed==3){
                    System.out.printf("%s ",word);
                    counterC=0;
                    counterO=0;
                    counterN=0;
                    letterPassed=0;
                    word="";
                }
               text=scan.nextLine();
           }

    }
}
