package WhileLoopsLab;

import java.util.Scanner;

public class P06MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();

        int maxNum = Integer.MIN_VALUE;
        while (!command.equals("Stop")){
            int num = Integer.parseInt(command);
            if (num>maxNum){
                maxNum=num;
            }
            command= scan.nextLine();
        }
        System.out.println(maxNum);
    }
}
