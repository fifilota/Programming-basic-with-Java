package ExamMarch2020;

import java.util.Scanner;

public class P05SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double capacity = Double.parseDouble(scan.nextLine()); // капацитет на самолета / обем на багажника
        int baggageCounter=0; // броим куфарите, които се побират
        double occupiedSpace=0; // пресмятаме заетото пространство
        boolean noMoreSpace=false;

        String command = scan.nextLine();

        while (!command.equals("End")){
            double baggageVolume = Double.parseDouble(command);
            if (baggageCounter!=0 && baggageCounter%3==0){ // веднага проверяваме за всеки 3ти куфар
                occupiedSpace=occupiedSpace + baggageVolume*1.10; // довавяме 10% към обема на съответния куфар
            }else {
                occupiedSpace +=baggageVolume;
            }

            if (capacity<=occupiedSpace){ // проверяваме дали остава място за още багаж и прекъсваме
                noMoreSpace=true;
                break;
            }
            baggageCounter++; // отброяваме качените куфари - правим го тук, защото ако следващия е по-голям не трябва да го включваме

            command= scan.nextLine();
        }

        if (noMoreSpace){ // ако мястото е свършило
            System.out.printf("No more space!%nStatistic: %d suitcases loaded.",baggageCounter);
        }else { // ако сме събрали всичкия багаж - получили сме командата Енд
            System.out.printf("Congratulations! All suitcases are loaded!%nStatistic: %d suitcases loaded.",baggageCounter);
        }
    }
}
// na 90% reshena!!!
