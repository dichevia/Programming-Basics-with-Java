package ProgrammingBasicsOnlineExam3and4November2018;

import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lastSector = scanner.nextLine();
        char lastSectorChar = lastSector.charAt(0);
        int sitsSectorOne = Integer.parseInt(scanner.nextLine());
        int oddSits = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        for (char i = 'A'; i <= lastSectorChar; i++) {
            for (int j = 1; j <= sitsSectorOne; j++) {
                for (char k = 'a'; k < 'a' + oddSits + 2; k++) {
                    if (j % 2 != 0) {
                        if (k == 'a' + oddSits) {
                            break;
                        }
                        System.out.printf("%c%d%c\n", i, j, k);
                        counter++;
                    } else {
                        System.out.printf("%c%d%c\n", i, j, k);
                        counter++;
                    }

                }
            }
            sitsSectorOne++;
        }
        System.out.println(counter);
    }
}
