package ConditionalStatementsExercise;

import java.util.Scanner;

public class ThreeBrothers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstBTime = Double.parseDouble(scanner.nextLine());
        double secondBTime = Double.parseDouble(scanner.nextLine());
        double thirdBTime = Double.parseDouble(scanner.nextLine());
        double fatherTime = Double.parseDouble(scanner.nextLine());

        double allBTime = 1/(1/firstBTime + 1/secondBTime + 1/thirdBTime);
        double allTime = allBTime+(allBTime*0.15);

        System.out.printf("Cleaning time: %.2f%n", allTime);

        if(fatherTime<allTime){
            System.out.printf("No, there isn't a surprise" + " - shortage of time -> " + "%.0f hours.", Math.ceil(allTime-fatherTime));
        } else {
            System.out.printf("Yes, there is a surprise - time left ->"  + " %.0f hours.", Math.floor(fatherTime-allTime));
        }

    }
}
