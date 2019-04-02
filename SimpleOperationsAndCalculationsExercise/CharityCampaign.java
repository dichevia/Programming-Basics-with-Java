package SimpleOperationsAndCalculationsExercise;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dni = Integer.parseInt(scanner.nextLine());
        int sladkari = Integer.parseInt(scanner.nextLine());
        int torti = Integer.parseInt(scanner.nextLine());
        int gofreti = Integer.parseInt(scanner.nextLine());
        int palachinki = Integer.parseInt(scanner.nextLine());

        double sTorti = torti*45;
        double sGofreti = gofreti*5.80;
        double sPalachinki = palachinki*3.20;

        double os1 = (sTorti+sGofreti+sPalachinki)*sladkari;
        double osk = os1*dni;

        double res = osk - (osk*1/8);

        System.out.printf("%.2f", res);

    }
}
