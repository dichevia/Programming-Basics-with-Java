package NestedLoopsLab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            double budget = Double.parseDouble(scanner.nextLine());
            double savedMoney = 0;

            while (budget > savedMoney) {
                double money = Double.parseDouble(scanner.nextLine());
                savedMoney += money;
            }
            System.out.printf("Going to %s!\n", input);

            input = scanner.nextLine();
        }
    }
}
