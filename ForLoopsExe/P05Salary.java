package ForLoopsExe;

import java.util.Scanner;

public class P05Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabs = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());

        boolean salaryIsZero = false;

        for (int i = 1; i <= tabs; i++) {
            String webSite = scan.nextLine();
            if (webSite.equals("Facebook")) {
                salary = salary - 150;
                if (salary <= 0) {
                    salaryIsZero=true;
                    break;
                }
            } else if (webSite.equals("Instagram")) {
                salary = salary - 100;
                if (salary <= 0) {
                    salaryIsZero=true;
                    break;
                }
            } else if (webSite.equals("Reddit")) {
                salary = salary - 50;
                if (salary <= 0) {
                    salaryIsZero=true;
                    break;
                }
            }
        }
       if (salaryIsZero){
           System.out.println("You have lost your salary.");
       }else {
           System.out.println(salary);
       }
    }
}
