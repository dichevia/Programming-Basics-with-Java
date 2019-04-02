package NestedLoopsLab;

import java.util.Scanner;

public class Cookiefactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int batch = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= batch; i++) {
            boolean flour = false;
            boolean eggs = false;
            boolean sugar = false;
            String component = scanner.nextLine();
            while (!(component.equals("Bake!") && flour && eggs && sugar)) {
                if (component.equals("Bake!")) {
                    System.out.println("The batter should contain flour, eggs and sugar!");
                }
                if (component.equals("flour")) {
                    flour = true;
                } else if (component.equals("eggs")) {
                    eggs = true;
                } else if (component.equals("sugar")) {
                    sugar = true;
                }

                component = scanner.nextLine();
            }
            System.out.printf("Baking batch number %d...\n", i);
        }
    }
}

