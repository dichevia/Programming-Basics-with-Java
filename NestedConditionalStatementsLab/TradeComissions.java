package NestedConditionalStatementsLab;

import java.util.Scanner;

public class TradeComissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double comission = -1.0;

        switch (city){
            case "Sofia":
                if (sales >= 0 && sales <=500){
                    comission = sales*0.05;
                }else if (sales >500 && sales <= 1000){
                    comission = sales * 0.07;
                }else if (sales >1000 && sales <=10000){
                    comission = sales * 0.08;
                }else if (sales > 10000){
                    comission = sales*0.12;
                }
                break;
            case "Varna":
                if (sales >= 0 && sales <=500){
                    comission = sales*0.045;
                }else if (sales >500 && sales <= 1000){
                    comission = sales * 0.075;
                }else if (sales >1000 && sales <=10000){
                    comission = sales * 0.10;
                }else if (sales > 10000){
                    comission = sales*0.13;
                }
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <=500){
                    comission = sales*0.055;
                }else if (sales >500 && sales <= 1000){
                    comission = sales * 0.08;
                }else if (sales >1000 && sales <=10000){
                    comission = sales * 0.12;
                }else if (sales > 10000){
                    comission = sales*0.145;
                }
                break;
        }if (comission == -1){
            System.out.println("error");
        }else {
            System.out.printf("%.2f", comission);
        }
    }
}
