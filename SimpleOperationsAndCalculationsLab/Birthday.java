package SimpleOperationsAndCalculationsLab;

import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double procent = Double.parseDouble(scanner.nextLine());

        double oAquarium = lenght*width*height;
        double oLitre = oAquarium*0.001;
        double oProcent = procent*0.01;

        double result = oLitre*(1-oProcent);

        System.out.printf("%.3f", result);


    }
}
