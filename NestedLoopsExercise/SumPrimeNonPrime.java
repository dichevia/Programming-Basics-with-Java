package NestedLoopsExercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int sumNotPrime = 0;
        int sumPrime = 0;

        while (!command.equals("stop")) {
            int number = Integer.parseInt(command);
            if (number < 0) {
                System.out.println("Number is negative.");
                number = 0;
            }
            boolean isnotPrime = false;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isnotPrime = true;
                    break;
                }
            }
            if (!isnotPrime) {
                sumPrime += number;
            } else {
                sumNotPrime += number;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d", sumNotPrime);
    }
}
