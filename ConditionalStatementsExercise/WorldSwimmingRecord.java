package ConditionalStatementsExercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeSwimming = Double.parseDouble(scanner.nextLine());

        double ivanchoDistance = distance*timeSwimming;
        double resistance = Math.floor(distance/15)*12.5;
        double allTime = ivanchoDistance+resistance;


        if (worldRecord>allTime){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", allTime);
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", allTime-worldRecord);
        }

    }
}
