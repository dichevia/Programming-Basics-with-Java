package NestedLoopsExercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juryNumber = Integer.parseInt(scanner.nextLine());
        String presentationName = scanner.nextLine();

        double averageGrade = 0;
        double finalScore = 0;
        int counterPresentation = 0;

        while (!"Finish".equals(presentationName)) {

            for (int i = 0; i < juryNumber; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                averageGrade += grade;

            }
            counterPresentation++;
            finalScore += averageGrade / juryNumber;

            System.out.printf("%s - %.2f.\n", presentationName, averageGrade / juryNumber);
            presentationName = scanner.nextLine();
            averageGrade = 0;
        }
        System.out.printf("Student's final assessment is %.2f.", finalScore / counterPresentation);
    }
}
