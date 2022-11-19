package FirstStepsCodigExe;

import java.util.Scanner;

public class P08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int annualFee = Integer.parseInt(scan.nextLine());

       double sneackersPrice = annualFee - annualFee*0.40;
       double outfitPrice = sneackersPrice- sneackersPrice*0.20;
       double ballPrice = outfitPrice/4;
       double accessories = ballPrice/5;

       double sum = annualFee + sneackersPrice + outfitPrice + ballPrice + accessories;

        System.out.println(sum);
    }
}
