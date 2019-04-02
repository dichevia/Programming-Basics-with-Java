package ForLoopLab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }

        }
        if (sumEven == sumOdd) {
            System.out.println("Yes, sum = " + sumEven);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sumEven - sumOdd));
        }
    }
}
