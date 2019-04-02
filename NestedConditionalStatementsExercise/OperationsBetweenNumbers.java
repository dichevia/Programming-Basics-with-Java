package NestedConditionalStatementsExercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);

        String output = "";
        double result = 0.0;

        switch (operator){
            case  '+':
                result = num1+num2;
                output = String.format("%d %c %d = %.0f", num1, operator, num2, result);
                break;
            case '-': result = num1-num2;
                output = String.format("%d %c %d = %.0f", num1, operator, num2, result);
                break;
            case '*':
                result = num1*num2;
                output = String.format("%d %c %d = %.0f", num1, operator, num2, result);
                break;
            case '/':
                result = num1*1.0/num2;
                output = String.format("%d %c %d = %.2f", num1, operator, num2, result);
                break;
            case '%':
                if (num2 !=0) {
                    result = num1 % num2;
                    output = String.format("%d %c %d = %.0f", num1, operator, num2, result);
                }
                break;
        }
        if ((operator == '/' || operator == '%') && num2==0){
            output = String.format("Cannot divide %d by zero", num1);
        }else if(operator == '+' || operator == '-' || operator == '*'){
            if (result%2 == 0){
                output += " - even";
            }else {
                output += " - odd";
            }
        }
        System.out.println(output);
    }
}
