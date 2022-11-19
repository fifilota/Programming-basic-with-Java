package ExamJuly2020;

import java.util.Scanner;

public class P06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNum = Integer.parseInt(scan.nextLine());//първото число
        int secondNum = Integer.parseInt(scan.nextLine());//второто число

        int f1 = 0;//тук ще запазим първата цифра на първото число
        int s1 = 0;//първата цифра на второто число
        int f2 = 0;//втората цифра на първото число
        int s2 = 0;//втората цифра на второто число
        int f3 = 0;//третата цифра на първото число
        int s3 = 0;//третата цифра на второто число
        int f4 = 0;//четвъртата цифра на първото число
        int s4 = 0;//четвъртата цифра на второто число

        for (int i = 4; i >= 1; i--) {//цикъл за намиране на цифрите на първото число
            if (i == 4) {//за четвръртата цифра
                f4 = firstNum % 10;//намираме я
                firstNum = firstNum / 10;//махаме я
            } else if (i == 3) {//за третата цифра
                f3 = firstNum % 10;//намираме я
                firstNum = firstNum / 10;//махаме я
            } else if (i == 2) {//за втората
                f2 = firstNum % 10;//намираме я
                firstNum = firstNum / 10;//махаме я
            } else if (i == 1) {//за първата
                f1 = firstNum % 10;//намираме я
            }
        }

        for (int i = 4; i >= 1; i--) {//цикъл за намиране на цифрите на второто число
            if (i == 4) {
                s4 = secondNum % 10;
                secondNum = secondNum / 10;
            } else if (i == 3) {
                s3 = secondNum % 10;
                secondNum = secondNum / 10;
            } else if (i == 2) {
                s2 = secondNum % 10;
                secondNum = secondNum / 10;
            } else if (i == 1) {
                s1 = secondNum % 10;
            }
        }

        ////цикъл за намиране на комбинациите от дадените цифри (4 вложени за всяка цифра)
        for (int i = f1; i <= s1; i++) { //от първата цифра на първото до първата цифра на второто
            for (int j = f2; j <= s2; j++) {//от втората цифра на първото до втората цифра на второто и т.н.
                for (int k = f3; k <= s3; k++) {
                    for (int l = f4; l <= s4; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {//задавеме условие всички да са нечетни
                            System.out.printf("%d%d%d%d ",i,j,k,l);//принтираме комбинациите
                        }
                    }
                }
            }
        }
    }
}
//Пример за намиране изобщо на всички нечетни числа между първото и второто число
//        int firstNum = Integer.parseInt(scan.nextLine());  Ako tarsim vsichki kombinacii ot nechetni dijiti v diapazona firstNum i secondNum
//        int secondNum = Integer.parseInt(scan.nextLine());
//
//        for (int i = firstNum; i <=secondNum; i++) {
//            int oddDigitCount=0;
//            int currentNum= i;
//            for (int j = 4; j >=1; j--) {
//                int digit = currentNum%10;
//                if(digit%2==1){
//                    oddDigitCount++;
//                }else {
//                    oddDigitCount=0;
//                }
//                currentNum = currentNum/10;
//            }
//            if (oddDigitCount==4){
//                System.out.printf("%d ",i);
//            }
//        }
