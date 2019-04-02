package ProgrammingBasicsSampleExam28October2018;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int lastNumber = n%10;
        int middleNumber = (n/10)%10;
        int firstNUmber = (n/100)%10;

        for (int i = 1; i <=lastNumber ; i++) {
            for (int j = 1; j <=middleNumber ; j++) {
                for (int k = 1; k <=firstNUmber; k++) {
                    int sum = i*j*k;

                    System.out.printf("%d * %d * %d = %d;\n", i, j, k, sum);
                }
            }
        }
    }
}
