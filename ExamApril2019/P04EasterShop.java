package ExamApril2019;

import java.util.Scanner;

public class P04EasterShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int eggsAtStart = Integer.parseInt(scan.nextLine());//яйца в началото

        String command = scan.nextLine();
        boolean noMoreEggs = false;
        int soldEggs = 0;

        while (!command.equals("Close")){//докато не затвори магазина
            String action = command;
            int eggsCount = Integer.parseInt(scan.nextLine());//яйца за купуване или допълване
            if (eggsCount>eggsAtStart&&action.equals("Buy")){//ако купува и са повече от наличните
                noMoreEggs=true;
                break;
            }
            if (action.equals("Buy")){//ако купува
                eggsAtStart-=eggsCount;//намаляваме наличните
                soldEggs+=eggsCount;//инкре.продадените
            } else if (action.equals("Fill")) {//ако запълваме
                eggsAtStart+=eggsCount;//инкрем.наличните
            }

            command= scan.nextLine();
        }
        if (noMoreEggs){//ако свършат яйцата
            System.out.println("Not enough eggs in store!");
            System.out.printf("You can buy only %d.",eggsAtStart);
        }else {//ако затвори магазина
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.",soldEggs);
        }
    }
}
