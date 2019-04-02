package NestedConditionalStatementsExercise;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        double sofiaGames = (48 - h)*3.0/4;
        double holidays = p * 2.0/3;
        double totalGames = sofiaGames+holidays+h;

        if ("leap".equals(year)){
            totalGames = totalGames * 1.15;
        }
        System.out.printf("%d", (int)(totalGames) );
    }
}
