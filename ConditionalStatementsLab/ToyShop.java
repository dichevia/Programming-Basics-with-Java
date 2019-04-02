package ConditionalStatementsLab;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceExcursion = Double.parseDouble(scanner.nextLine());
        int cPuzzles = Integer.parseInt(scanner.nextLine());
        int cDolls = Integer.parseInt(scanner.nextLine());
        int cBears = Integer.parseInt(scanner.nextLine());
        int cMinions = Integer.parseInt(scanner.nextLine());
        int cTrucks = Integer.parseInt(scanner.nextLine());

        double pSum = (cPuzzles*2.60)+(cDolls*3)+(cBears*4.10)+(cMinions*8.20)+(cTrucks*2);
        double cToys = cPuzzles+cDolls+cBears+cMinions+cTrucks;
        if (cToys>=50){
            pSum = pSum - (pSum*0.25);
        }
        double profit = pSum - (pSum*0.1);
        if (profit>=priceExcursion){
            System.out.printf("Yes! %.2f lv left.", profit-priceExcursion);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(profit-priceExcursion));
        }

    }
}
