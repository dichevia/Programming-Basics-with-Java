package WhileLoopExercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poorGrades = Integer.parseInt(scanner.nextLine());
        double sumScore = 0;
        int gradeCounter = 0;
        String lastProblem = "";
        int pGrades = 0;

        while (true) {
            String examName = scanner.nextLine();

            if ("Enough".equals(examName)) {
                System.out.printf("Average score: %.2f%n", sumScore / gradeCounter);
                System.out.printf("Number of problems: %d%n", gradeCounter);
                System.out.printf("Last problem: %s", lastProblem);
                return;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            sumScore += grade;
            gradeCounter++;
            lastProblem = examName;
            if (grade <= 4) {
                pGrades++;
            }
            if (pGrades == poorGrades) {
                System.out.printf("You need a break, %d poor grades.", pGrades);
                break;
            }
        }
    }
}
