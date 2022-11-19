package WhileLoopsExe;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String wantedBook = scan.nextLine();
        String command = scan.nextLine();
        int booksCounter=0;
        boolean isFound = false;
        while (!command.equals("No More Books")){
            if (command.equals(wantedBook)){
                isFound=true;
                break;
            }
            booksCounter++;

            command= scan.nextLine();
        }

        if (isFound){
            System.out.printf("You checked %d books and found it.",booksCounter);
        }else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",booksCounter);
        }
    }
}
