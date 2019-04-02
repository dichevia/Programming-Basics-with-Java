package NestedConditionalStatementsExercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String seasson = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (seasson){
            case "Spring":
                if (fishermen<=6){
                    price = 3000*0.90;
                }else if (fishermen>7 && fishermen<=11){
                    price = 3000*0.85;
                }else if (fishermen>=12){
                    price = 3000*0.75;
                }
                break;
            case "Summer":

            case "Autumn":
                if (fishermen<=6){
                    price = 4200*0.90;
                }else if (fishermen>7 && fishermen<=11){
                    price = 4200*0.85;
                }else if (fishermen>=12){
                    price = 4200*0.75;
                }
                break;
            case "Winter":
                if (fishermen<=6){
                    price = 2600*0.90;
                }else if (fishermen>7 && fishermen<=11){
                    price = 2600*0.85;
                }else if (fishermen>=12){
                    price = 2600*0.75;
                }
                break;
        }if (seasson.equals("Spring") || seasson.equals("Summer") || seasson.equals("Winter")){
            if (fishermen%2==0){
                price = price*0.95;
            }
        }if (budget>=price){
            System.out.printf("Yes! You have %.2f leva left.", budget-price);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget-price));
        }
    }
}
