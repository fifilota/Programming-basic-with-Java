package WhileLoopsExe;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int pieces = width*length;
        boolean noMoreCake = false;
        String input = scan.nextLine();

        while (!input.equals("STOP")){
            int takenPieces = Integer.parseInt(input);
            pieces-=takenPieces;
            if (pieces<=0){
                noMoreCake=true;
                break;
            }
            input= scan.nextLine();
        }
        if (noMoreCake){
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(pieces));
        }else {
            System.out.printf("%d pieces are left.",pieces);
        }
    }
}
