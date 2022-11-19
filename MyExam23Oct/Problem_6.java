package MyExam23Oct;

import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int a = 1; a <=9; a++) {
            for (int b = 9; b >=1; b--) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 9; d ==0; d--) {

                        if (((a + b + c + d) == (a * b * c * d)) && n % 10 == 5) {
                            System.out.printf("%d%d%d%d", a, b, c, d);
                            break;
                        } else if (((a * b * c * d) / (a + b + c + d) == 3) && n % 3 == 0) {
                            System.out.printf("%d%d%d%d", d, c, b, a);
                            break;
                        } else {
                            System.out.println("Nothing found");
                            break;
                        }

                    }

                }

            }

        }
    }
}
