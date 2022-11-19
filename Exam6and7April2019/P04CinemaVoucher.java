package Exam6and7April2019;

import java.util.Scanner;

public class P04CinemaVoucher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int voucher = Integer.parseInt(scan.nextLine()); //стойност на ваучера
        int tickets = 0; // брой закупени билети за филм
        int otherProducts = 0; // брой закупени други неща

        while (true) {
            String product = scan.nextLine(); // четем продукта
            int length = product.length(); // дължината му
            int price = 0; // цена на продукта
            if (product.equals("End")) {
                break;
            }
            if (length > 8) { // ако дължината на символите е по-голяма от 8 символа - ще бъде билет за филм
                price = (int) product.charAt(0) + (int) product.charAt(1);// цената се образува от асци стойностите на първите 2 символа
                if (price > voucher) {//ако цената надхвърли стойността на ваучера прекъсваме
                    break;
                }
                voucher -= price;//изваждаме цената на продукта от стойността на ваучера
                tickets++; // инкрементираме билетите
            } else { // ако е под 8 символа
                price = (int) product.charAt(0); // цената се получава от асци стойността на първия символ
                if (price > voucher) { // отново проверка дали цената надвишава ваучера
                    break;
                }
                voucher -= price; // изваждаме цената от ваучера
                otherProducts++; // инкрементираме за др. продукти
            }
        }
        System.out.println(tickets);
        System.out.println(otherProducts);
    }
}
