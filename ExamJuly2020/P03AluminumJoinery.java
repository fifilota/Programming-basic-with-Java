package ExamJuly2020;

import java.util.Scanner;

public class P03AluminumJoinery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int profilCount = Integer.parseInt(scan.nextLine()); //броя поръчани дограми
        String profilType = scan.nextLine();//видът на дограмата
        String delivery = scan.nextLine();//с или без включена доставка

       double profilPrice= 0;//цена на дограмата
       double totalPrice=0;//крайна сума за плащане


        switch (profilType){//според вида на дограмата изчисляваме цената й
            case "90X130":
                profilPrice=110;
                if (profilCount>30&&profilCount<=60){//в същото време изчисляваме според броя поръчана дограма
                    profilPrice=profilPrice*0.95;
                } else if (profilCount>60) {
                    profilPrice=profilPrice*0.92;
                }
                break;
            case "100X150":
                profilPrice=140;
                if (profilCount>40&&profilCount<=80){
                    profilPrice=profilPrice*0.94;
                } else if (profilCount>80) {
                    profilPrice=profilPrice*0.90;
                }
                break;
            case "130X180":
                profilPrice=190;
                if (profilCount>20&&profilCount<=50){
                    profilPrice=profilPrice*0.93;
                } else if (profilCount>50) {
                    profilPrice=profilPrice*0.88;
                }
                break;
            case "200X300":
                profilPrice=250;
                if (profilCount>25 && profilCount<=50){
                    profilPrice=profilPrice*0.91;
                } else if (profilCount>50) {
                    profilPrice=profilPrice*0.86;
                }
                break;
        }

        totalPrice=profilPrice*profilCount;//крайната сума - крайна цена * броя поръчани

        if (delivery.equals("With delivery")){//ако има доставка я прибавяме
            totalPrice=totalPrice+60;
        }
        if (profilCount<10){//ако поръчаната дограма е под 10бр.
            System.out.print("Invalid order");
        } else if (profilCount>99) {//ако е над 99...
            totalPrice=totalPrice*0.96;
            System.out.printf("%.2f BGN",totalPrice);
        }else {//ако е между 10 и 99
            System.out.printf("%.2f BGN",totalPrice);
        }
    }
}
