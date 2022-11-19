package NestedLoopsExe;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();

        int countAllGrades =0;
        double allGradesSum =0;
        while (!command.equals("Finish")){
            String presentation = command;

            double sumCurrentGrades =0;
            for (int i = 1; i <=n; i++) {
                double currentGrade = Double.parseDouble(scan.nextLine());
                countAllGrades++;
                sumCurrentGrades+=currentGrade;
            }

            allGradesSum+=sumCurrentGrades;
            double averageCurrentGrade=sumCurrentGrades/n;
            System.out.printf("%s - %.2f.%n",presentation,averageCurrentGrade);




            command= scan.nextLine();


        }
        double finalGrade=allGradesSum/countAllGrades;
        System.out.printf("Student's final assessment is %.2f.",finalGrade);
    }
}
