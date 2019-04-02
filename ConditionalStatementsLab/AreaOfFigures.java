package ConditionalStatementsLab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();
        double size = 0.0;

        if (figure.equals("square")){
            double side = Double.parseDouble(scanner.nextLine());
            size = side*side;
        }else if (figure.equals("rectangle")){
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            size = sideA*sideB;
        }else if (figure.equals("circle")){
            double r = Double.parseDouble(scanner.nextLine());
            size = Math.PI*r*r;
        }else if (figure.equals("triangle")){
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            size = (sideA*sideB)/2;
        }
        System.out.printf("%.3f", size);
    }
}
