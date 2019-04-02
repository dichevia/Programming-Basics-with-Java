package ProgrammingBasicsOnlineExam28and29July2018;

import java.util.Scanner;

public class GroupStage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int matchPlayed = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int countScored = 0;
        int countReceived = 0;

        for (int i = 0; i <matchPlayed ; i++) {
            int scoredGoals = Integer.parseInt(scanner.nextLine());
            int receivedGoals = Integer.parseInt(scanner.nextLine());
            countScored += scoredGoals;
            countReceived += receivedGoals;

            if (scoredGoals>receivedGoals){
                points+=3;
            }else if (scoredGoals == receivedGoals){
                points+=1;
            }
        }
        if (countScored>=countReceived){
            System.out.printf("%s has finished the group phase with %d points.\nGoal difference: %d.", name, points, countScored-countReceived);
        }else {
            System.out.printf("%s has been eliminated from the group phase.\nGoal difference: %d.", name, countScored-countReceived);
        }
    }
}
