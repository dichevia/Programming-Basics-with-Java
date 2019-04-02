package ConditionalStatementsExercise;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dohod = Double.parseDouble(scanner.nextLine());
        double uspeh = Double.parseDouble(scanner.nextLine());
        double minRabZaplata = Double.parseDouble(scanner.nextLine());

        if (uspeh >= 4.5 && uspeh < 5.5 && dohod < minRabZaplata) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(minRabZaplata * 0.35));
        } else if (uspeh >= 5.5 && dohod < minRabZaplata) {
            if ((minRabZaplata * 0.35) > (uspeh * 25)) {
                System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(minRabZaplata * 0.35));
            } else System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(uspeh * 25));
        } else if (uspeh >= 5.5) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(uspeh * 25));
        } else System.out.println("You cannot get a scholarship!");

    }
}