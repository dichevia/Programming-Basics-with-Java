package ConditionalStatementsExercise;

import java.util.Scanner;

public class Choreography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cSteps = Integer.parseInt(scanner.nextLine());
        int cDancers = Integer.parseInt(scanner.nextLine());
        int cDays = Integer.parseInt(scanner.nextLine());

        double stepsPerDay = Math.ceil((1.0*cSteps/cDays)/cSteps*100);
        double procentSteps = stepsPerDay/cDancers;

        if (stepsPerDay<=13){
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.", procentSteps);
        }else {
            System.out.printf("No, They will not succeed in that goal! Required %.2f%% steps to be learned per day.", procentSteps);
        }
    }
}
