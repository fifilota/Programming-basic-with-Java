package WhileLoopsExe;

import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            int width = Integer.parseInt(scan.nextLine());
            int length = Integer.parseInt(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());
            boolean noMoreSpace = false;

            int volume = width*length*height;

            String input = scan.nextLine();

            while (!input.equals("Done")){
                int boxes = Integer.parseInt(input);
                volume-=boxes;
                if (volume<=0){
                    noMoreSpace=true;
                    break;
                }
                input= scan.nextLine();

            }
            if (noMoreSpace){
                System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(volume));
            }else {
                System.out.printf("%d Cubic meters left.",volume);
            }
    }
}
