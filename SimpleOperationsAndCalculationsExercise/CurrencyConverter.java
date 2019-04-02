package SimpleOperationsAndCalculationsExercise;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        String inputCur = scanner.nextLine();
        String outputCur = scanner.nextLine();

        if (inputCur.equals("USD")){
            sum = sum*1.79549;}
            else if (inputCur.equals("GBP")){
                sum = sum * 2.53405;
            }
            else if (inputCur.equals("EUR")){
                sum = sum * 1.95583;
            }


        if (outputCur.equals("USD")){
            sum = sum / 1.79549;}
            else if (outputCur.equals("GBP")){
                sum = sum / 2.53405;
            }
            else if (outputCur.equals("EUR")){
                sum = sum / 1.95583;
            }


        System.out.printf("%.2f %s", sum, outputCur );

    }
}
