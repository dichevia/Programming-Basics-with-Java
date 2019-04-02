package SimpleOperationsAndCalculationsExercise;

import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lenght = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double aSide = Double.parseDouble(scanner.nextLine());

        double pArea = (lenght*100)*(width*100);
        double paSide = (aSide*100)*(aSide*100);
        double pChair = pArea/10;
        double freeSpace = pArea - paSide-pChair;

        double cDancers = freeSpace / (40+7000);

        System.out.printf("%.0f",Math.floor(cDancers));
    }
}
