package NestedConditionalStatementsExercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String seasson = scanner.nextLine();
        String placeToSleep = "";

        if (budget >= 0 && budget <= 100){
            System.out.println("Somewhere in Bulgaria");
            if ("summer".equals(seasson)) {
                budget = budget * 0.30;
                placeToSleep = "Camp";
            } else if ("winter".equals(seasson)) {
                budget = budget * 0.70;
                placeToSleep = "Hotel";;
            }
        } else if(budget <= 1000) {
            System.out.println("Somewhere in Balkans");
            if ("summer".equals(seasson)) {
                budget = budget * 0.40;
                placeToSleep = "Camp";
            } else if ("winter".equals(seasson)) {
                budget = budget * 0.80;
                placeToSleep = "Hotel";
            }
        }else if (budget>1000){
            System.out.println("Somewhere in Europe");
            if ("summer".equals(seasson)) {
                budget = budget * 0.9;
                placeToSleep = "Hotel";
            } else if ("winter".equals(seasson)) {
                budget = budget * 0.9;
                placeToSleep = "Hotel";
            }

        }
        System.out.printf("%s - %.2f", placeToSleep, budget);
    }
}
