package ConditionalStatementsExercise;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();

        if (input.equals("mm")){
            number=number/1000;
        }else if (input.equals("cm")){
            number=number /100;
        }else if (input.equals("mi")){
            number=number/0.000621371192;
        }else if (input.equals("in")){
            number=number/39.3700787;
        }else if (input.equals("km")){
            number=number/0.001;
        }else if (input.equals("ft")){
            number=number/3.2808399;
        }else if (input.equals("yd")){
            number=number/1.0936133;
        }
        if (output.equals("mm")){
            number=number*1000;
        }else if (output.equals("cm")){
            number=number*100;
        }else if (output.equals("mi")){
            number=number*0.000621371192;
        }else if (output.equals("in")){
            number=number*39.3700787;
        }else if (output.equals("km")){
            number=number*0.001;
        }else if (output.equals("ft")){
            number=number*3.2808399;
        }else if (output.equals("yd")){
            number=number*1.0936133;
        }
        System.out.printf("%.8f", number);
    }
}
