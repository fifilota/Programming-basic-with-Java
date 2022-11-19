package ExamMarch2020;

import java.util.Scanner;

public class P02MountainRun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double record = Double.parseDouble(scan.nextLine()); // рекордът за подобряване
        double distanceInM = Double.parseDouble(scan.nextLine()); // разстояние, което трябва да изкачи в метри
        double timeInSPerM = Double.parseDouble(scan.nextLine()); // за колко секунди изкачва 1 метър

        double georgiTime = distanceInM*timeInSPerM; // времето за което е изкачил разстоянието без забавянето!
        double slowDown = Math.floor(distanceInM/50)*30; // изчисляваме забавянето отделно. С Мат флоор закръгляме само
        // разстоянието, без 30те секунди, те се умножават после!
        double finalGeorgiTime = georgiTime+slowDown; // времето му вече със забавянето

        if (finalGeorgiTime<record){ // проверяваме дали времето му е по-малко от рекорда
            System.out.printf("Yes! The new record is %.2f seconds.",finalGeorgiTime);
        }else {
            System.out.printf("No! He was %.2f seconds slower.", finalGeorgiTime-record);
        }
    }
}
