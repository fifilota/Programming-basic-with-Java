package CondStateAdvanLab;

import java.util.Scanner;

public class P05SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        String town = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        double price = 0;

        switch (town){
            case "Sofia":
                if (product.equals("coffee")){
                    price=0.50*quantity;
                } else if (product.equals("water")) {
                    price=0.80*quantity;
                } else if (product.equals("beer")) {
                    price=1.20*quantity;
                } else if (product.equals("sweets")) {
                    price=1.45*quantity;
                } else if (product.equals("peanuts")) {
                    price=1.60*quantity;
                }
                break;
            case "Plovdiv":
                if (product.equals("coffee")){
                    price=0.40*quantity;
                } else if (product.equals("water")) {
                    price=0.70*quantity;
                } else if (product.equals("beer")) {
                    price=1.15*quantity;
                } else if (product.equals("sweets")) {
                    price=1.30*quantity;
                } else if (product.equals("peanuts")) {
                    price=1.50*quantity;
                }
                break;
            case "Varna":
                if (product.equals("coffee")){
                    price=0.45*quantity;
                } else if (product.equals("water")) {
                    price=0.70*quantity;
                } else if (product.equals("beer")) {
                    price=1.10*quantity;
                } else if (product.equals("sweets")) {
                    price=1.35*quantity;
                } else if (product.equals("peanuts")) {
                    price=1.55*quantity;
                }
                break;
        }
        System.out.println(price);
    }
}
