package NestedLoopsExercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = num1; i <= num2; i++) {
            int currentNumber = i;
            int sumEquals = 0;
            int sumOdds = 0;

            for (int j = 0; j < 6; j++) {
                int tempNum = currentNumber % 10;
                if (j % 2 == 0) {
                    sumEquals += tempNum;
                } else {
                    sumOdds += tempNum;
                }
                currentNumber /= 10;
            }
            if (sumEquals == sumOdds) {
                System.out.printf("%d ", i);
            }
        }
    }
}
