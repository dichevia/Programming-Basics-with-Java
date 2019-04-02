package WhileLoopExercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();
        int capacity = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        while (capacity > 0){
            String newBook = scanner.nextLine();
            if (newBook.equals(bookName)){
                System.out.printf(	"You checked %d books and found it.", counter);
                return;
            }
            counter++;
            capacity--;
        }
        System.out.println("The book you search is not here!");
        System.out.printf("You checked %d books.", counter);
    }
}
