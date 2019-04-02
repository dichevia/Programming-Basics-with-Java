package WhileLoopExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double excursionMoney = Double.parseDouble(scanner.nextLine());
        double avaibleMoney = Double.parseDouble(scanner.nextLine());
        int dayCounter = 0;
        int spentCounter = 0;

        while (true) {
            String action = scanner.nextLine();
            double dayMoney = Double.parseDouble(scanner.nextLine());
            dayCounter++;
            if (action.equals("spend")) {
                spentCounter++;
                avaibleMoney -= dayMoney;
                if (dayMoney > avaibleMoney) {
                    avaibleMoney = 0;
                }
            } else if (action.equals("save")) {
                spentCounter = 0;
                avaibleMoney += dayMoney;
            }
            if (avaibleMoney >= excursionMoney) {
                System.out.printf("You saved the money for %d days.", dayCounter);
                return;
            }
            if (spentCounter >= 5) {
                System.out.println("You can't save the money.");
                System.out.printf("%d", dayCounter);
                break;
            }
        }
    }
}
