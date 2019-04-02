package ConditionalStatementsExercise;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int minutes15 = minutes+15;

        if (minutes15>59){
            minutes15=minutes15-60;
            hours=hours+1;
        }
        if (hours == 24){
            hours=0;
        }
        if (minutes15<=9){
            System.out.println(hours + ":" + "0"+minutes15);
        }else  System.out.println(hours + ":" + minutes15);
    }
}
