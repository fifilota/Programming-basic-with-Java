package WhileLoopsLab;

import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        int year =1;
        double sumGrades = 0;
        int poorGradeCount= 0;
        boolean isExcluded = false;

        while (year<=12){
            if (poorGradeCount>1){
                isExcluded=true;
                break;
            }
            double grade = Double.parseDouble(scan.nextLine());
            if (grade<4){
                poorGradeCount++;
                continue;
            }
            sumGrades += grade;
            year++;
        }
        if (isExcluded){
            System.out.printf("%s has been excluded at %d grade",name,year);
        }else {
            double averageGrade= sumGrades/12;
            System.out.printf("%s graduated. Average grade: %.2f",name,averageGrade);
        }
    }
}
