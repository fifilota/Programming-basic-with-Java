package ExamMarch2020;

import java.util.Scanner;

public class P04FoodforPets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine()); // период/дни, за който се прави статистика
        double totalFood = Double.parseDouble(scan.nextLine()); // общо количество храна

        double allFoodEaten = 0; // общо количество изядена храна
        double dogFoodEaten=0; // общо количество храна, изядена от кучето
        double catFoodEaten=0; // общо количесво храна, изядена от котката
        double biscuitsEaten =0; // брой изядени бисквитки

        for (int i = 1; i <=days; i++) { // от първи до последен ден
            int dog = Integer.parseInt(scan.nextLine()); // изядена от кучето храна за деня
            int cat = Integer.parseInt(scan.nextLine()); // изядена от котката храна за деня
            dogFoodEaten=dogFoodEaten+dog; // сумираме към общата изядена от кучето
            catFoodEaten=catFoodEaten+cat; // сумираме към общата изядена от котката
            allFoodEaten=allFoodEaten+dog+cat; // сумираме и двете към общата изядена
            if (i%3==0){ // на всеки 3ти ден
                biscuitsEaten=biscuitsEaten + (dog+cat)*0.10; // 10те % ги прибавяме само към изядената от куче и коте за съответния
                // ден, и после сумираме към общите бисквитки.
            }
        }
        System.out.printf("Total eaten biscuits: %.0fgr.%n",biscuitsEaten); // общо бисквитки в гр, но закръглени към най-близкото цяло
        System.out.printf("%.2f%% of the food has been eaten.%n",(allFoodEaten*100)/totalFood); // общо изядената*100/на общата храна
        System.out.printf("%.2f%% eaten from the dog.%n",(dogFoodEaten*100)/allFoodEaten); // общо изядена от куче*100/ на общо изядената!!!
        System.out.printf("%.2f%% eaten from the cat.%n",(catFoodEaten*100)/allFoodEaten); // общо изядена от коте*100/ на общо изядената!!!
    }
}
