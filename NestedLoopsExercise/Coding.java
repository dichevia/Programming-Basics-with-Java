package NestedLoopsExercise;

import java.util.Scanner;

public class Coding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int tempNumber = 0;
        int charNum = 0;

        for (int i = 0; i <= number; i += 2) {
            tempNumber = number % 10;
            charNum = tempNumber + 33;

            if (tempNumber == 0) {
                System.out.print("ZERO");
            }

            for (int j = 0; j < tempNumber; j++) {
                System.out.print((char) charNum);
            }
            number /= 10;
            System.out.println();
            i = -1;
        }
    }
}
