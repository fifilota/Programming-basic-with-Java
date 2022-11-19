package Exam6and7April2019;

import java.util.Scanner;

public class P05MovieRatings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());//брой филми, които деси е набелязала
        double maxRate =Integer.MIN_VALUE;//максимална стойност
        double minRate =Integer.MAX_VALUE;//минимална стойност
        double allRates =0;//сумираме всички рейтинги
        String maxxRate ="";//ще запазим името на филма с най-висок рейтинг
        String minnRate ="";//и този с най-нисък


        for (int i = 1; i <=n ; i++) {//за всеки филм четем:
            String name = scan.nextLine();//име на филма
            double rating = Double.parseDouble(scan.nextLine());//неговият рейтинг
            allRates+=rating;//сумираме рейтинга на всички
            if (rating>maxRate){//проверка дали текущия рейтинг е най-висок
                maxRate=rating;
                maxxRate=name;
            }else if (rating<minRate){//проверка дали е най-нисък
                minRate=rating;
                minnRate=name;
            }
        }

        System.out.printf("%s is with highest rating: %.1f%n",maxxRate,maxRate);
        System.out.printf("%s is with lowest rating: %.1f%n",minnRate,minRate);
        double averageRate = allRates/n;
        System.out.printf("Average rating: %.1f",averageRate);
    }
}
