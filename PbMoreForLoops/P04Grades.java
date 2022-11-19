package PbMoreForLoops;

import java.util.Scanner;

public class P04Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int students = Integer.parseInt(scan.nextLine());

        int grade2To3 = 0;
        int grade3To4 = 0;
        int grade4To5 = 0;
        int grade5Above = 0;
        double gradesCount = 0;
        for (int i = 1; i <=students; i++) {
            double grade = Double.parseDouble(scan.nextLine());
            gradesCount += grade;
            if (grade<=2.99){
                grade2To3++;
            } else if (grade<=3.99) {
                grade3To4++;
            } else if (grade<=4.99) {
                grade4To5++;
            } else if (grade>=5) {
                grade5Above++;
            }
        }
        double averageGrade = gradesCount/students;
        double grade2To3P = grade2To3*1.00/students*100;
        double grade3To4P = grade3To4*1.00/students*100;
        double grade4To5P = grade4To5*1.00/students*100;
        double grade5AboveP = grade5Above*1.00/students*100;

        System.out.printf("Top students: %.2f%%%n",grade5AboveP);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",grade4To5P);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",grade3To4P);
        System.out.printf("Fail: %.2f%%%n",grade2To3P);
        System.out.printf("Average: %.2f",averageGrade);
    }
}
