package WhileLoopsLab;

import java.util.Scanner;

public class P07MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();

        int minNum = Integer.MAX_VALUE;

        while (!command.equals("Stop")){
            int num = Integer.parseInt(command);

            if (num<minNum){
                minNum=num;
            }

            command= scan.nextLine();
        }
        System.out.println(minNum);
    }
}
