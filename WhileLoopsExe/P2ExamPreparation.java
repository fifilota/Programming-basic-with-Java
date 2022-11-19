package WhileLoopsExe;

import java.util.Scanner;

public class P2ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine()); // n - poor grades permitted.
        int poorGradeCounter =0;
        String problemName = scan.nextLine();
        int sumGrades=0;
        int problemCounter=0;
        String lastProblem="";
        boolean needBreak =false;

        while (!problemName.equals("Enough")){
            problemCounter++;
            int grade = Integer.parseInt(scan.nextLine());
            sumGrades +=grade;
            if (grade<=4){
                poorGradeCounter++;
            }
            if (poorGradeCounter==n){
                needBreak=true;
                break;
            }
            lastProblem=problemName;
            problemName= scan.nextLine();
        }

        if (needBreak){
            System.out.printf("You need a break, %d poor grades.",poorGradeCounter);
        }else {
            double averageGrade = sumGrades*1.00/problemCounter;
            System.out.printf("Average score: %.2f%n",averageGrade);
            System.out.printf("Number of problems: %d%n",problemCounter);
            System.out.printf("Last problem: %s",lastProblem);

        }
    }
}
