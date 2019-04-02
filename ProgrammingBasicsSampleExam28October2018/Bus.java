package ProgrammingBasicsSampleExam28October2018;

import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int passengers = Integer.parseInt(scanner.nextLine());
        int stops = Integer.parseInt(scanner.nextLine());

        int allPassengers = 0;

        for (int i = 1; i <=stops ; i++) {
            int going = Integer.parseInt(scanner.nextLine());
            int coming = Integer.parseInt(scanner.nextLine());
             if (i==1){
                 allPassengers += passengers + coming - going +2;
             }
            if (i % 2 !=0 && i!=1){
                allPassengers += coming - going +2;
            }else if (i % 2 ==0){
                allPassengers+= coming - going -2;
            }
        }
        System.out.printf("The final number of passengers is : %d", allPassengers);
    }
}
