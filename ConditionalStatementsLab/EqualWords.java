package ConditionalStatementsLab;

import java.util.Scanner;

public class EqualWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        if (word1.equalsIgnoreCase(word2) ){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
