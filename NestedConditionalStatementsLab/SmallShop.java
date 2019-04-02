package NestedConditionalStatementsLab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;

        if (town.equals("Sofia")) {
            if (product.equals("coffee")) {
                price = 0.50 * quantity;
            } else if (product.equals("water")) {
                price = 0.80 * quantity;
            } else if (product.equals("beer")) {
                price = 1.20 * quantity;
            } else if (product.equals("sweets")) {
                price = 1.45 * quantity;
            } else if (product.equals("peanuts")) {
                price = 1.60 * quantity;
            }
        } else if (town.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                price = 0.40 * quantity;
            } else if (product.equals("water")) {
                price = 0.70 * quantity;
            } else if (product.equals("beer")) {
                price = 1.15 * quantity;
            } else if (product.equals("sweets")) {
                price = 1.30 * quantity;
            } else if (product.equals("peanuts")) {
                price = 1.50 * quantity;
            }
        } else if (town.equals("Varna")) {
            if (product.equals("coffee")) {
                price = 0.45 * quantity;
            } else if (product.equals("water")) {
                price = 0.70 * quantity;
            } else if (product.equals("beer")) {
                price = 1.10 * quantity;
            } else if (product.equals("sweets")) {
                price = 1.35 * quantity;
            } else if (product.equals("peanuts")) {
                price = 1.55 * quantity;
            }
        }
        System.out.println(price);
    }
}
