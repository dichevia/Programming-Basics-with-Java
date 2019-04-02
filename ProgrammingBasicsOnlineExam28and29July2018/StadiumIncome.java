package ProgrammingBasicsOnlineExam28and29July2018;

import java.util.Scanner;

public class StadiumIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sector = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        double priceTicket = Double.parseDouble(scanner.nextLine());

        double incoming = capacity * priceTicket;
        double moneyForSector = incoming / sector;
        double charity = (incoming-(moneyForSector*0.75))/8;
        System.out.printf("Total income - %.2f BGN\n", incoming);
        System.out.printf("Money for charity - %.2f BGN", charity);
    }
}
