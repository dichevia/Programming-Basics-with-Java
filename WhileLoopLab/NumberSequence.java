package WhileLoopLab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int minimalValue = Integer.MAX_VALUE;
        int maximalValue = Integer.MIN_VALUE;

        while (!number.equals("END")){
            int num = Integer.parseInt(number);
            if (num>maximalValue){
                maximalValue=num;
            }
            if (num<minimalValue){
                minimalValue=num;
            }
            number = scanner.nextLine();
        }
        System.out.printf("Max number: %d%n", maximalValue);
        System.out.printf("Min number: %d", minimalValue);
    }
}
