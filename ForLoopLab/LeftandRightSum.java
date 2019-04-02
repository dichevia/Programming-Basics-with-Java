package ForLoopLab;

import java.util.Scanner;

public class LeftandRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < 2 * n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i < n) {
                sumLeft += number;
            }
            if (i >= n && i < 2 * n) {
                sumRight += number;
            }

        }
        if (sumLeft == sumRight) {
            System.out.println("Yes, sum = " + sumLeft);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sumLeft - sumRight));
        }
    }
}
