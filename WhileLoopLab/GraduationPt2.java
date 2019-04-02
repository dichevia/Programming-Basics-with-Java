package WhileLoopLab;

import java.util.Scanner;

public class GraduationPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int counter = 1;
        double sumGrades = 0.0;
        int fail = 2;

        while (counter <= 12 && fail!=0) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4.00) {
                sumGrades += grade;
                counter++;
            } else  {
                fail--;
            }
        }
        double averageGrade = sumGrades / 12;
        if (fail!=0) {
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
        }else {
            System.out.printf("%s has been excluded at %d grade", name, counter);
        }
    }
}
