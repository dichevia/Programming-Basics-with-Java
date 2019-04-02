package ProgrammingBasicsOnlineExam3and4November2018;

import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceParty = Double.parseDouble(scanner.nextLine());
        int loveLetters = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int keys = Integer.parseInt(scanner.nextLine());
        int caricatures = Integer.parseInt(scanner.nextLine());
        int luckySurprises = Integer.parseInt(scanner.nextLine());

        double sum = loveLetters * 0.6 + roses * 7.2 + keys * 3.6 + caricatures * 18.2 + luckySurprises * 22;
        double count = loveLetters + roses + keys + caricatures + luckySurprises;

        if (count >= 25) {
            sum = sum * 0.65;
        }
        double hosting = sum * 0.1;
        double totalSum = sum - hosting;

        if (totalSum >= priceParty) {
            System.out.printf("Yes! %.2f lv left.", totalSum - priceParty);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(totalSum - priceParty));
        }
    }
}
