package WhileLoopLab;

import java.util.Scanner;

public class WaterDispenser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int volume = Integer.parseInt(scanner.nextLine());
        int volumeOnTap = 0;
        int counter = 0;

        while (volumeOnTap < volume) {
            String tap = scanner.nextLine();
            if (tap.equals("Easy")) {
                volumeOnTap = volumeOnTap + 50;
            } else if (tap.equals("Medium")) {
                volumeOnTap = volumeOnTap + 100;
            } else if (tap.equals("Hard")) {
                volumeOnTap = volumeOnTap + 200;
            }
            counter++;
        }
        if (volumeOnTap > volume) {
            System.out.printf("%dml has been spilled.", volumeOnTap - volume);
        } else {
            System.out.printf("The dispenser has been tapped %d times.", counter);
        }
    }
}
