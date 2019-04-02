package WhileLoopLab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int broiVnoski = Integer.parseInt(scanner.nextLine());
        double total = 0;
        int counter = 1;


        while (counter<=broiVnoski){
            double vnoska = Double.parseDouble(scanner.nextLine());
            if (vnoska<0){
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n", vnoska);

            total = total+vnoska;
            counter++;
        }
        System.out.printf("Total: %.2f",total);
    }
}
