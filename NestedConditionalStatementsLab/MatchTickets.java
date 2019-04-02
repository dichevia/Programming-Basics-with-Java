package NestedConditionalStatementsLab;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double transport = 0;

        if (people >= 1 && people <= 4) {
            transport = budget * 0.75;
        } else if (people >= 5 && people <= 9) {
            transport = budget * 0.6;
        } else if (people >= 10 && people <= 24) {
            transport = budget * 0.5;
        } else if (people >= 25 && people <= 49) {
            transport = budget * 0.4;
        } else if (people >= 50) {
            transport = budget * 0.25;
        }
        double leftMoney = budget - transport;
        switch (category) {
            case "VIP":
                double priceTicketv = 499.99 * people;
                if (leftMoney >= priceTicketv) {
                    System.out.printf("Yes! You have %.2f leva left.", leftMoney - priceTicketv);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(leftMoney - priceTicketv));
                }
                break;
            case "Normal":
                double priceTicketn = 249.99 * people;
                if (leftMoney >= priceTicketn) {
                    System.out.printf("Yes! You have %.2f leva left.", leftMoney - priceTicketn);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(leftMoney - priceTicketn));
                }
                break;
        }
    }
}
