package ExamMarch2020;

import java.util.Scanner;

public class P06TournamentofChristmas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int daysOfTournament = Integer.parseInt(scan.nextLine()); // бр. дни на турнира

        double allMoney = 0; // всичко събрани пари
        int winingDaysCount=0; // брояч за победител на деня
        int loosingDayCount=0; // брояч за губещ за деня

        for (int i = 1; i <=daysOfTournament; i++) { // от ден 1 до последния ден от турнира
            String  command = scan.nextLine(); // име на игра до команда Финиш
            int winingGameCount=0; // брояч за спечелени игри за деня
            int loosingGameCount=0; // брояч за загубени игри за деня
            double moneyPerDay=0; // общо спечелени пари за деня
            while (!command.equals("Finish")){ //за всяка игра четем резултат - победа или загуба
                String result = scan.nextLine();
                if (result.equals("win")){
                    moneyPerDay+=20; // прибавяме към общо спечелена сума за деня
                    winingGameCount++; // увеличаваме брояча за спечелена игра
                }else {
                    loosingGameCount++; // няма пари за добавяне, само брояза за загубена игра
                }

                command= scan.nextLine(); // четем нова игра
            }
            if (winingGameCount>loosingGameCount){ // извън уайл цикъла проверяваме дали имаме повече спечелени игри от загубени
                winingDaysCount++; // брояча за победител на деня
                allMoney=allMoney+moneyPerDay*1.10; // добавяме 10% но само към сумата за съответния ден!
            }else {
                loosingDayCount++; // брояч за губещ за деня
                allMoney=allMoney+moneyPerDay; // прибавяме си спечелените пари
            }
        }
        if (winingDaysCount>loosingDayCount){ // извън циклите проверщваме дали имаме повече спечелени дни и спе победители в турнира
            allMoney=allMoney*1.20; // ако да прибавяме 20% към сумата и пронтираме
            System.out.printf("You won the tournament! Total raised money: %.2f",allMoney);
        }else { // ако не сме загубили турнира и принтираме събраната сума
            System.out.printf("You lost the tournament! Total raised money: %.2f",allMoney);
        }
    }
}
