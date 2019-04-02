package com.company.variantOne;

import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double startBudget = budget;
        String input = scanner.nextLine();

        int balloons = 0;
        int flowers = 0;
        int candles = 0;
        int ribbons = 0;

        while (!input.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (input.equals("balloons")) {
                budget -= 0.1 * quantity;
                balloons += quantity;
            } else if (input.equals("flowers")) {
                budget -= 1.5 * quantity;
                flowers += quantity;
            } else if (input.equals("candles")) {
                budget -= 0.5 * quantity;
                candles += quantity;
            } else if (input.equals("ribbon")) {
                budget -= 2 * quantity;
                ribbons += quantity;
            }
            if (budget <= 0) {
                System.out.println("All money is spent!");
                System.out.printf("Purchased decoration is %d balloons, %d m ribbon, %d flowers and %d candles.", balloons, ribbons, flowers, candles);
                return;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Spend money: %.2f\nMoney left: %.2f\n", startBudget - budget, budget);
        System.out.printf("Purchased decoration is %d balloons, %d m ribbon, %d flowers and %d candles.", balloons, ribbons, flowers, candles);

    }
}

