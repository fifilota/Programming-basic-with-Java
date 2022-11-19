package CondStateAdvanLab;

import java.util.Scanner;

public class P04PersonalTitles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double age = Double.parseDouble(scan.nextLine());
        String gender = scan.nextLine();

//        Mr." - мъж (пол "m") на 16 или повече години
//        "Master" - момче (пол "m") под 16 години
//        "Ms." - жена (пол "f") на 16 или повече години
//        "Miss" - момиче (пол "f") под 16 години

        if (gender.equals("m")){
            if (age>=16){
                System.out.println("Mr.");
            }else {
                System.out.println("Master");
            }
        } else if (gender.equals("f")) {
            if (age>=16){
                System.out.println("Ms.");
            }else {
                System.out.println("Miss");
            }
        }
    }
}
