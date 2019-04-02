package NestedLoopsLab;

import java.util.Scanner;

public class NameWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int winner = 0;
        String winnerName = "";

        while (!input.equals("STOP")) {
            int sumLetters = 0;
            for (int i = 0; i < input.length(); i++) {
                int letter = input.charAt(i);
                sumLetters += letter;

            }
            if (sumLetters > winner) {
                winner = sumLetters;
                winnerName = input;

            }

            input = scanner.nextLine();
        }
        System.out.printf("Winner is %s - %d!", winnerName, winner);
    }
}
