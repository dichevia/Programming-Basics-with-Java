package WhileLoopLab;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int allSteps = 0;

        while (!input.equals("Going home")) {
            int stepsDay = Integer.parseInt(input);
            allSteps = allSteps + stepsDay;
            if (allSteps >= 10000) {
                System.out.println("Goal reached! Good job!");
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Going home")) {
            int lastSteps = Integer.parseInt(scanner.nextLine());
            allSteps = lastSteps + allSteps;
            if (allSteps >= 10000) {
                System.out.println("Goal reached! Good job!");
            } else {
                System.out.printf("%d more steps to reach goal.", 10000 - allSteps);
            }
        }
    }
}
