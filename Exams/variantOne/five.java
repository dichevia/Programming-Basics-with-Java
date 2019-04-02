package com.company.variantOne;

import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int averExpforMonths = Integer.parseInt(scanner.nextLine());

        double sumElectr = 0;

        for (int i = 0; i < averExpforMonths; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());
            sumElectr += electricity;
        }
        double water = 20 * averExpforMonths;
        double internet = 15 * averExpforMonths;
        double others = (sumElectr + water + internet) * 1.20;

        double sum = sumElectr + water + internet + others;
        double forMonth = sum / averExpforMonths;

        System.out.printf("Electricity: %.2f lv\n", sumElectr);
        System.out.printf("Water: %.2f lv\n", water);
        System.out.printf("Internet: %.2f lv\n", internet);
        System.out.printf("Other: %.2f lv\n", others);
        System.out.printf("Average: %.2f lv\n", forMonth);

    }
}
