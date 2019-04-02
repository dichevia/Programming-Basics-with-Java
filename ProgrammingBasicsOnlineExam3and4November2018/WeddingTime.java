package ProgrammingBasicsOnlineExam3and4November2018;

import java.util.Scanner;

public class WeddingTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double whiskyPrice = Double.parseDouble(scanner.nextLine());
        double waterLitre = Double.parseDouble(scanner.nextLine());
        double wineLitre = Double.parseDouble(scanner.nextLine());
        double champagneLitre = Double.parseDouble(scanner.nextLine());
        double whiskyLitre = Double.parseDouble(scanner.nextLine());

        double champagnePrice = whiskyPrice * 0.5;
        double winePrice = champagnePrice * 0.4;
        double waterPrice = champagnePrice * 0.1;

        double sumChampagne = champagneLitre * champagnePrice;
        double sumWine = wineLitre * winePrice;
        double sumWater = waterLitre * waterPrice;
        double sumWhisky = whiskyLitre * whiskyPrice;

        double totalSum = sumChampagne + sumWater + sumWhisky + sumWine;

        System.out.printf("%.2f", totalSum);
    }
}
