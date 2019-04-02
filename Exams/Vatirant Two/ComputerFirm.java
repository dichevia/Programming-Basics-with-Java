package com.company;

import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int computerNumber = Integer.parseInt(scanner.nextLine());

        double totalSales = 0;
        double totalRating = 0;

        for (int i = 0; i < computerNumber; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            int rating = number%10;
            int sales = number/10;

            totalRating += rating;

            switch (rating){
                case 3:
                    totalSales+=sales*0.5;
                    break;
                case 4:
                    totalSales+=sales*0.7;
                    break;
                case 5:
                    totalSales+=sales*0.85;
                    break;
                case 6:
                    totalSales+=sales;
            }
        }
        System.out.printf("%.2f%n", totalSales);
        System.out.printf("%.2f", totalRating/computerNumber);
    }
}
