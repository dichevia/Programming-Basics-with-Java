package ForLoopLab;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        int moneyFirst = 10;
        int sumMoney = 0;
        int brotherTakenMoney = 0;
        int counterToys = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                sumMoney = sumMoney + moneyFirst;
                moneyFirst = moneyFirst + 10;
                brotherTakenMoney += 1;
            } else {
                counterToys++;
            }
        }
        double allToysPrice = priceToy * counterToys;
        double allMoney = (sumMoney - brotherTakenMoney) + allToysPrice;

        if (allMoney >= priceWashingMachine) {
            System.out.printf("Yes! %.2f", allMoney - priceWashingMachine);
        } else {
            System.out.printf("No! %.2f", Math.abs(allMoney - priceWashingMachine));
        }
    }
}
