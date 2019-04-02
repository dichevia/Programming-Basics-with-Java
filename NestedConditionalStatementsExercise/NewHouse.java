package NestedConditionalStatementsExercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int counts = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double flowerPrice = 0.0;

        switch (flower){
            case "Roses":
                flowerPrice = 5;
                flowerPrice = (flowerPrice*counts);
                if(counts>80){
                    flowerPrice = flowerPrice * 0.90;
                }
                break;
            case "Dahlias":
                flowerPrice = 3.80;
                flowerPrice = (flowerPrice*counts);
                if (counts>90){
                    flowerPrice = flowerPrice * 0.85;
                }
                break;
            case "Tulips":
                flowerPrice = 2.80;
                flowerPrice = (flowerPrice*counts);
                if (counts>80){
                    flowerPrice = flowerPrice * 0.85;
                }
                break;
            case "Narcissus":
                flowerPrice = 3;
                flowerPrice = (flowerPrice*counts);
                if (counts<120){
                    flowerPrice = flowerPrice * 1.15;
                }
                break;
            case "Gladiolus":
                flowerPrice = 2.5;
                flowerPrice = (flowerPrice*counts);
                if (counts<80){
                    flowerPrice = flowerPrice * 1.20;
                }
                break;
        }
        if (flowerPrice <= budget) {

            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", counts, flower, Math.abs(flowerPrice-budget));
        }else{
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(flowerPrice-budget));
        }
    }
}
