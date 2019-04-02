package ProgrammingBasicsSampleExam28October2018;

import java.util.Scanner;

public class Spaceship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double l = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double astronautsH = Double.parseDouble(scanner.nextLine());

        double ship = w * l * h;
        double room = (astronautsH + 0.4) * 2 * 2;

        double space = Math.floor(ship / room);

        if (space >= 3 && space <= 10) {
            System.out.printf("The spacecraft holds %.0f astronauts.", space);
        } else if (space < 3) {
            System.out.println("The spacecraft is too small.");
        } else if (space > 10) {
            System.out.println("The spacecraft is too big.");
        }

    }
}
