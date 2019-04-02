package NestedLoopsExercise;

import java.util.Scanner;

public class PartyInvitation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int validCount = 0;
        int inValidCount = 0;
        int nameCount = 0;

        while (!"Statistic".equals(input)) {
            boolean valid = true;
            nameCount++;
            input = input.toLowerCase();

            for (int i = 0; i < input.length(); i++) {
                char symbol = input.charAt(i);
                if (symbol < 97 || symbol > 122) {
                    valid = false;

                }
            }
            if (valid) {
                validCount++;
                input = input.substring(0, 1).toUpperCase() + input.substring(1);
                System.out.printf("%s\n", input);
            } else {
                inValidCount++;
                System.out.println("Invalid name!");
            }

            input = scanner.nextLine();
        }
        System.out.printf("Valid names are %.2f%% from %d names.\n", (validCount * 1.0 / nameCount) * 100, nameCount);
        System.out.printf("Invalid names are %.2f%% from %d names.\n", (inValidCount * 1.0 / nameCount) * 100, nameCount);
    }
}
