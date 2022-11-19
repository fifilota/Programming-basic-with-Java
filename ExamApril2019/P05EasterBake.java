package ExamApril2019;

import java.util.Scanner;

public class P05EasterBake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kozunaci = Integer.parseInt(scan.nextLine());//брой козунаци за правене

        int allSugarUsed=0;//всичко използвана захар
        int allFlourUsed =0; // всичко използвано брашно
        int maxSugarUsed=Integer.MIN_VALUE; // намираме макс използвано кол.захар
        int maxFlourUsed = Integer.MIN_VALUE; // ...

        for (int i = 1; i <=kozunaci; i++) {//за всеки един козунак
            int sugarUsed = Integer.parseInt(scan.nextLine());//колко захар сме използвали
            allSugarUsed+=sugarUsed;//инкр.използваната
            if (sugarUsed>maxSugarUsed){//проверяваме дали е най-много досега
                maxSugarUsed=sugarUsed;
            }
            int flourUsed = Integer.parseInt(scan.nextLine());//същото правим за брашното
            allFlourUsed+=flourUsed;
            if (flourUsed>maxFlourUsed){
                maxFlourUsed=flourUsed;
            }
        }
        double packsOfSugar = Math.ceil(allSugarUsed*1.0/950);//извън цикъла изчисляваме колко пакета са необходими
        double packsOfFlour = Math.ceil(allFlourUsed*1.0/750);

        System.out.printf("Sugar: %.0f%n",packsOfSugar);
        System.out.printf("Flour: %.0f%n",packsOfFlour);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.",maxFlourUsed,maxSugarUsed);
    }
}
