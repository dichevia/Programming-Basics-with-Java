package NestedLoopsExercise;

import java.util.Scanner;

public class EqualSumsLeftRightPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = num1; i <= num2; i++) {
            int currentNumber = i;
            int sumRight = 0;
            int sumLeft = 0;
            int middleSum = 0;
            for (int j = 0; j < 2; j++) {
                int rightSumNum = currentNumber % 10;
                sumRight += rightSumNum;
                currentNumber /= 10;
            }
            for (int j = 2; j > 0; j--) {
                int leftSumNum = currentNumber / 10;
                if (j == 2) {
                    middleSum = currentNumber % 10;
                }
                leftSumNum %= 10;
                sumLeft += leftSumNum;
                currentNumber /= 10;
            }
            if (sumLeft < sumRight) {
                sumLeft += middleSum;
            } else if (sumRight < sumLeft) {
                sumRight += middleSum;
            }
            if (sumLeft == sumRight)
                System.out.printf("%d ", i);
        }
    }
}
