package ProgrammingBasicsOnlineExam3and4November2018;

import java.util.Scanner;

public class WeddingInvestment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String yearsContract = scanner.nextLine();
        String typeContract = scanner.nextLine();
        String desert = scanner.nextLine();
        int monthsPayment = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        switch (yearsContract) {
            case "one":
                switch (typeContract) {
                    case "Small":
                        sum = 9.98;
                        break;
                    case "Middle":
                        sum = 18.99;
                        break;
                    case "Large":
                        sum = 25.98;
                        break;
                    case "ExtraLarge":
                        sum = 35.99;
                        break;
                }
                break;
            case "two":
                switch (typeContract) {
                    case "Small":
                        sum = 8.58;
                        break;
                    case "Middle":
                        sum = 17.09;
                        break;
                    case "Large":
                        sum = 23.59;
                        break;
                    case "ExtraLarge":
                        sum = 31.79;
                        break;
                }
                break;
        }

        if (desert.equals("yes")) {
            if (sum <= 10) {
                sum += 5.5;
            } else if (sum > 10 && sum <= 30) {
                sum += 4.35;
            } else if (sum > 30) {
                sum += 3.85;
            }
        }
        if (yearsContract.equals("two")) {
            sum = sum * 0.9625;
        }
        System.out.printf("%.2f lv.", sum * monthsPayment);
    }
}
