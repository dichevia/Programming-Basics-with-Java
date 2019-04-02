package ProgrammingBasicsSampleExam28October2018;

import java.util.Scanner;

public class SeaTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyForFoodDay = Double.parseDouble(scanner.nextLine());
        double moneyForSouvenirsDay = Double.parseDouble(scanner.nextLine());
        double moneyForHotelDay = Double.parseDouble(scanner.nextLine());

        double fuel = 29.4;
        double fuelMoney = fuel * 1.85;
        double foodAndSouvenirs = (3 * moneyForFoodDay) + (3 * moneyForSouvenirsDay);

        double oneDay = moneyForHotelDay * 0.9;
        double twoDay = moneyForHotelDay * 0.85;
        double threeDay = moneyForHotelDay * 0.8;

        double allSum = fuelMoney + foodAndSouvenirs + oneDay + twoDay + threeDay;

        System.out.printf("Money needed: %.2f", allSum);
    }
}
