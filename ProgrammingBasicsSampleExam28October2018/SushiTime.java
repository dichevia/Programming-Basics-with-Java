package ProgrammingBasicsSampleExam28October2018;

import java.util.Scanner;

public class SushiTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sushiType = scanner.nextLine();
        String restoraunt = scanner.nextLine();
        int portionsCount = Integer.parseInt(scanner.nextLine());
        String order = scanner.nextLine();

        double allPrice = 0;


        switch (sushiType) {
            case "sashimi":
                switch (restoraunt) {
                    case "Sushi Zone":
                        allPrice = 4.99;
                        break;
                    case "Sushi Time":
                        allPrice = 5.49;
                        break;
                    case "Sushi Bar":
                        allPrice = 5.25;
                        break;
                    case "Asian Pub":
                        allPrice = 4.50;
                        break;
                }
                break;
            case "maki":
                switch (restoraunt) {
                    case "Sushi Zone":
                        allPrice = 5.29;
                        break;
                    case "Sushi Time":
                        allPrice = 4.69;
                        break;
                    case "Sushi Bar":
                        allPrice = 5.55;
                        break;
                    case "Asian Pub":
                        allPrice = 4.80;
                        break;
                }
                break;
            case "uramaki":
                switch (restoraunt) {
                    case "Sushi Zone":
                        allPrice = 5.99;
                        break;
                    case "Sushi Time":
                        allPrice = 4.49;
                        break;
                    case "Sushi Bar":
                        allPrice = 6.25;
                        break;
                    case "Asian Pub":
                        allPrice = 5.50;
                        break;
                }
                break;
            case "temaki":
                switch (restoraunt) {
                    case "Sushi Zone":
                        allPrice = 4.29;
                        break;
                    case "Sushi Time":
                        allPrice = 5.19;
                        break;
                    case "Sushi Bar":
                        allPrice = 4.75;
                        break;
                    case "Asian Pub":
                        allPrice = 5.50;
                        break;
                }
                break;
        }
        double allPortionPrice = allPrice * portionsCount;

        if (!(restoraunt.equals("Sushi Zone") || restoraunt.equals("Sushi Time") || restoraunt.equals("Sushi Bar") || restoraunt.equals("Asian Pub"))) {
            System.out.printf("%s is invalid restaurant!", restoraunt);
            return;
        }

        if (order.charAt(0) == 'N') {
            allPortionPrice = Math.ceil(allPortionPrice);
            System.out.printf("Total price: %.0f lv.", allPortionPrice);
        } else if (order.charAt(0) == 'Y') {
            double delivery = allPortionPrice * 0.2;
            allPortionPrice = allPortionPrice + delivery;
            allPortionPrice = Math.ceil(allPortionPrice);
            System.out.printf("Total price: %.0f lv.", allPortionPrice);
        }

    }
}
