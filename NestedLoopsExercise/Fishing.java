package NestedLoopsExercise;

import java.util.Scanner;

public class Fishing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fishes = Integer.parseInt(scanner.nextLine());

        double priceFishes = 0;
        double sumFree = 0;
        int counterFishes = 0;

        for (int i = 1; i <= fishes; i++) {
            String nameFish = scanner.nextLine();
            if (nameFish.equals("Stop")){
                break;
            }
            double fishWeigh = Double.parseDouble(scanner.nextLine());
            counterFishes++;
            int sumLettersFish = 0;
            for (int j = 0; j < nameFish.length(); j++) {
                int symbol = (int) nameFish.charAt(j);
                sumLettersFish += symbol;
            }
            if (i != 0 && i % 3 == 0) {
                sumFree += sumLettersFish / fishWeigh;
            } else {
                priceFishes += sumLettersFish / fishWeigh;
            }
        }
        if (counterFishes == fishes) {
            System.out.println("Lyubo fulfilled the quota!");
        }
        if (sumFree > priceFishes) {
            System.out.printf("Lyubo's profit from %d fishes is %.2f leva.", counterFishes, sumFree - priceFishes);
        } else {
            System.out.printf("Lyubo lost %.2f leva today.", Math.abs(sumFree - priceFishes));
        }
    }
}
