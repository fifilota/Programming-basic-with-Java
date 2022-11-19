package MyExam23Oct;

import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double allGrades=0;
        int group1 =0;
        int group2=0;
        int group3=0;
        int group4=0;


        for (int i = 1; i <=n; i++) {
            double grade = Double.parseDouble(scan.nextLine());
            if (grade<3){
                group1++;
                allGrades+=grade;
            } else if (grade<=3.99) {
                group2++;
                allGrades+=grade;
            } else if (grade<=4.99) {
                group3++;
                allGrades+=grade;
            }else {
                group4++;
                allGrades+=grade;
            }
        }
        double averageGrade = allGrades/n;
        System.out.printf("Top students: %.2f%%%n",group4*1.0/n*100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",group3*1.0/n*100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",group2*1.0/n*100);
        System.out.printf("Fail: %.2f%%%n",group1*1.0/n*100);
        System.out.printf("Average: %.2f",averageGrade);
    }
}
