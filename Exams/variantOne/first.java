package com.company.variantOne;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double whiskyPrice = Double.parseDouble(scanner.nextLine());
        double waterLitre = Double.parseDouble(scanner.nextLine());
        double wineLitre = Double.parseDouble(scanner.nextLine());
        double champaignLitre = Double.parseDouble(scanner.nextLine());
        double whiskyLitre = Double.parseDouble(scanner.nextLine());

        double champaignPrice = whiskyPrice*0.5;
        double winePrice = champaignPrice*0.4;
        double waterPrice = champaignPrice*0.1;

        double allSum = (whiskyPrice*whiskyLitre)+(winePrice*wineLitre)+(waterPrice*waterLitre)+(champaignPrice*champaignLitre);

        System.out.println(allSum);
    }
}
