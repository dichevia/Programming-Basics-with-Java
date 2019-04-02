package WhileLoopExercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());

        int cakeSize = width*lenght;
        String input = scanner.nextLine();

        while (!"STOP".equals(input)){
            int piece = Integer.parseInt(input);

            cakeSize -= piece;

            if (cakeSize<0){
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakeSize));
                return;
            }
            input = scanner.nextLine();
        }
        System.out.printf("%d pieces are left.", cakeSize);
    }
}
