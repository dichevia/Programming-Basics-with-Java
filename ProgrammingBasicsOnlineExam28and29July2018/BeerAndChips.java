package ProgrammingBasicsOnlineExam28and29July2018;

import java.util.Scanner;

public class BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int bottlesBeer = Integer.parseInt(scanner.nextLine());
        int chips = Integer.parseInt(scanner.nextLine());

        double totalBeers = bottlesBeer * 1.2;
        double totalChips = Math. ceil(totalBeers*0.45 * chips);
        double totalMoney = totalBeers + totalChips;

        if (totalMoney <= budget){
            System.out.printf("%s bought a snack and has %.2f leva left.", name, Math.abs (totalMoney - budget));
        } else {
            System.out.printf("%s needs %.2f more leva!", name, Math.abs(totalMoney-budget));
        }
    }
}
