package ProgrammingBasicsOnlineExam28and29July2018;

import java.util.Scanner;

public class FootballSouvenirs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        String souvenir = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        if (team.equals("Argentina")) {
            switch (souvenir) {
                case "flags":
                    totalPrice = 3.25;
                    break;
                case "caps":
                    totalPrice = 7.2;
                    break;
                case "posters":
                    totalPrice = 5.1;
                    break;
                case "stickers":
                    totalPrice = 1.25;
                    break;
                default:
                    System.out.println("Invalid stock!");

            }

        } else if (team.equals("Brazil")) {
            switch (souvenir) {
                case "flags":
                    totalPrice = 4.2;
                    break;
                case "caps":
                    totalPrice = 8.5;
                    break;
                case "posters":
                    totalPrice = 5.35;
                    break;
                case "stickers":
                    totalPrice = 1.2;
                    break;
                default:
                    System.out.println("Invalid stock!");

            }
        } else if (team.equals("Croatia")) {
            switch (souvenir) {
                case "flags":
                    totalPrice = 2.75;
                    break;
                case "caps":
                    totalPrice = 6.9;
                    break;
                case "posters":
                    totalPrice = 4.95;
                    break;
                case "stickers":
                    totalPrice = 1.1;
                    break;
                default:
                    System.out.println("Invalid stock!");

            }
        } else if (team.equals("Denmark")) {
            switch (souvenir) {
                case "flags":
                    totalPrice = 3.1;
                    break;
                case "caps":
                    totalPrice = 6.5;
                    break;
                case "posters":
                    totalPrice = 4.8;
                    break;
                case "stickers":
                    totalPrice = 0.9;
                    break;
                default:
                    System.out.println("Invalid stock!");

            }
        } else {
            System.out.println("Invalid country!");
        }
        totalPrice *= count;
        if (totalPrice>0){
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, souvenir, team, totalPrice );
        }

    }
}