package WhileLoopLab;

import java.util.Scanner;

public class NumberinRange1100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        while (n < 1 || n > 100) {
            System.out.println("Invalid number!");
            System.out.println("Еnter a number in the range [1...100]: ");
            n = Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("The number is: %d", n);
    }
}
