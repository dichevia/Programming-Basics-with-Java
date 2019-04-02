package SimpleOperationsAndCalculationsExercise;

import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cUiski = Double.parseDouble(scanner.nextLine());
        double bira = Double.parseDouble(scanner.nextLine());
        double vino = Double.parseDouble(scanner.nextLine());
        double rakia = Double.parseDouble(scanner.nextLine());
        double Uiski = Double.parseDouble(scanner.nextLine());

        double cRakia = cUiski-(0.5*cUiski);
        double cVino = cRakia-(0.4*cRakia);
        double cBira = cRakia-(0.8*cRakia);

        double sRakia = cRakia*rakia;
        double sVino = cVino*vino;
        double sBira = cBira*bira;
        double sUiski = cUiski*Uiski;

        double sum = sRakia+sVino+sBira+sUiski;

        System.out.printf("%.2f", sum);

    }
}
