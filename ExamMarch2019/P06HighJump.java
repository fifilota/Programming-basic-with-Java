package ExamMarch2019;

import java.util.Scanner;

public class P06HighJump {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int targetHeight = Integer.parseInt(scan.nextLine());
        int jumpCount = 0;
        int startHeight = targetHeight - 30;
        boolean trainSuccess = false;

        for (int height = startHeight; height <= targetHeight; height += 5) {
            int jumpsFailed = 0;
            for (int jump = 1; jump <= 3; jump++) {
                int jumHeight = Integer.parseInt(scan.nextLine());
                jumpCount++;
                if (jumHeight > height) {
                    break;
                } else {
                    jumpsFailed++;
                }
            }
            if (jumpsFailed == 3) {
                System.out.printf("Tihomir failed at %dcm after %d jumps.", height, jumpCount);
                return;
            }

        }
        System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.",targetHeight,jumpCount);

    }
}


