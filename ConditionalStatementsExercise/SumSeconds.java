package ConditionalStatementsExercise;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int secondP = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int sum  = first + secondP + third;
        int seconds = sum % 60;
        int minutes = sum / 60;

        if (seconds < 10){
            System.out.println(minutes + ":0" + seconds);
        }else {
            System.out.println(minutes + ":" + seconds);

        }
    }
}
