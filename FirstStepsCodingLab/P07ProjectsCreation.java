package FirstStepsCodingLab;

import java.util.Scanner;

public class P07ProjectsCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int projects = Integer.parseInt(scan.nextLine());
        int time = projects*3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, time, projects);
        //The architect {името на архитекта} will need {необходими часове} hours
        // to complete {брой на проектите} project/s.
    }
}
