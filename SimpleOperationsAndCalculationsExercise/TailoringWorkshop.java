package SimpleOperationsAndCalculationsExercise;

import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countTables = Integer.parseInt(scanner.nextLine());
        double lenghtTables = Double.parseDouble(scanner.nextLine());
        double widthTables = Double.parseDouble(scanner.nextLine());

        double pCovers = countTables*(lenghtTables+2*0.30)*(widthTables+2*0.30);
        double pCheks = countTables*(lenghtTables/2)*(lenghtTables/2);

        double USD = pCovers*7+pCheks*9;
        double BGN = USD*1.85;

        System.out.printf("%.2f USD\n", USD);
        System.out.printf("%.2f BGN", BGN);
    }
}
