package ExamMarch2020;

import java.util.Scanner;

public class P04TrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int groups = Integer.parseInt(scan.nextLine()); // колко групи ще има

        int countMusala =0; // общо брой изкачващи мусала
        int countMonblan =0; // ............... монблан
        int countKilimandjaro =0; // .......... килиманджаро
        int countK2=0; // .......... К2
        int countEverest=0; // ...... Еверест
        int countAllpeople =0; // общ брой хора от всички групи

        for (int i = 1; i <=groups; i++) { // от първа до последна група
            int peopleInGroup = Integer.parseInt(scan.nextLine()); // брой хора в съответната група

            if (peopleInGroup<=5){
                countMusala+=peopleInGroup;
                countAllpeople+=peopleInGroup;
            } else if (peopleInGroup<=12) {
                countMonblan+=peopleInGroup;
                countAllpeople+=peopleInGroup;
            } else if (peopleInGroup<=25) {
                countKilimandjaro+=peopleInGroup;
                countAllpeople+=peopleInGroup;
            } else if (peopleInGroup<=40) {
                countK2+=peopleInGroup;
                countAllpeople+=peopleInGroup;
            }else {
                countEverest+=peopleInGroup;
                countAllpeople+=peopleInGroup;
            }
        }
        System.out.printf("%.2f%%%n",countMusala*1.0/countAllpeople*100); // общо брой за мусала/общо от всички групи*100
        System.out.printf("%.2f%%%n",countMonblan*1.0/countAllpeople*100);
        System.out.printf("%.2f%%%n",countKilimandjaro*1.0/countAllpeople*100);
        System.out.printf("%.2f%%%n",countK2*1.0/countAllpeople*100);
        System.out.printf("%.2f%%%n",countEverest*1.0/countAllpeople*100);
    }
}
