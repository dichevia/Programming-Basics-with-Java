package ForLoopExercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int operBrowserTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        boolean isLost = false;

        for (int i=0; i<operBrowserTabs; i++){
            String webSite = scanner.nextLine();

            switch (webSite){
                case "Facebook":
                    salary-=150;
                    break;
                case "Instagram":
                    salary-=100;
                    break;
                case "Reddit":
                    salary-=50;
                    break;
            }
            if (salary<=0){
                System.out.println("You have lost your salary.");
                isLost = true;
                break;
            }
        }
        if (!isLost){
            System.out.println(salary);
        }
    }
}
