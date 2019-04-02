package com.company;

import java.util.Scanner;

public class Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        for (int i = a; i <= 8; i++) {
            for (int j = 9; j >= b; j--) {
                for (int k = c; k <= 8; k++) {
                    for (int l = 9; l >= d; l--) {
                        if (i % 2 == 0 && j % 2 != 0 && k % 2 == 0 && l % 2 != 0) {
                            if (i != k || j != l) {
                                System.out.printf("%d%d - %d%d\n", i, j, k, l);
                                counter++;
                                if (counter == 6) {
                                    return;
                                }
                            } else {
                                System.out.println("Cannot change the same player.");
                            }
                        }
                    }
                }
            }
        }
    }
}
