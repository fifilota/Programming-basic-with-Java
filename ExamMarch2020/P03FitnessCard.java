package ExamMarch2020;

import java.util.Scanner;

public class P03FitnessCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine()); // наличен бюджет за карта
        String gender = scan.nextLine(); // пол
        int age = Integer.parseInt(scan.nextLine()); // възраст
        String sport = scan.nextLine(); // вид спорт
        double priceCard = 0; // цена на картата

        switch (sport){ // суичваме по спорта
            case "Gym":
                if (gender.equals("m")){ // проверяваме по пол
                    priceCard=42;
                }else {
                    priceCard=35;
                }
                break;
            case "Boxing":
                if (gender.equals("m")){
                    priceCard=41;
                }else {
                    priceCard=37;
                }
                break;
            case "Yoga":
                if (gender.equals("m")){
                    priceCard=45;
                }else {
                    priceCard=42;
                }
                break;
            case "Zumba":
                if (gender.equals("m")){
                    priceCard=34;
                }else {
                    priceCard=31;
                }
                break;
            case "Dances":
                if (gender.equals("m")){
                    priceCard=51;
                }else {
                    priceCard=53;
                }
                break;
            case "Pilates":
                if (gender.equals("m")){
                    priceCard=39;
                }else {
                    priceCard=37;
                }
                break;
        }
        if (age<=19){ // проверяваме по години
            priceCard=priceCard*0.80; // 20% намаление
        }
        if (budget>=priceCard){ // проверяваме дали бюджета е стигнал
            System.out.printf("You purchased a 1 month pass for %s.",sport);
        }else {
            System.out.printf("You don't have enough money! You need $%.2f more.",priceCard-budget);
        }
    }
}
