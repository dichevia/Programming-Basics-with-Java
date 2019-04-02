package SimpleOperationsAndCalculationsExercise;

import java.util.Scanner;

public class TwoDRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());

        double sideA = Math.max(x1,x2)-Math.min(x1,x2);
        double sideB = Math.max(y1,y2)-Math.min(y1,y2);

        double area = sideA*sideB;
        double perimeter = 2*(sideA+sideB);

        System.out.println(area);
        System.out.println(perimeter);
    }
}
