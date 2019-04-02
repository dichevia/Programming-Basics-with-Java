package com.company;

import java.util.Scanner;

public class SymbolCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int digitSum =0;
        String digits = "";
        int upperLettersSum =0;
        String upperLetters = "";
        int lowerLetterSum =0;
        String loweLetter = "";
        int otherSum = 0;
        String other ="";

        for (int i=0; i<n; i++){
            char symbol = scanner.nextLine().charAt(0);

            int value = (int) symbol;

            if (value >=48 && value<=57){
                digitSum+=value;
                digits+=symbol;
            }else if (value >=65 && value<=90){
                upperLettersSum+=value;
                upperLetters+=symbol;
            }else if(value >=97 && value<=122){
                lowerLetterSum+=value;
                loweLetter+=symbol;
            }else {
                otherSum+=value;
                other+=symbol;
            }
        }
        int result1 = Math.max(digitSum, upperLettersSum);
        int result2 = Math.max(lowerLetterSum, otherSum);
        int result = Math.max(result1, result2);

        if (digitSum == result){
            System.out.printf("Biggest ASCII sum is: %d\n", result);
            System.out.printf("Combinations of characters with biggest ASCII sum is: %d", digitSum);
        }else if (upperLettersSum == result){
            System.out.printf("Biggest ASCII sum is: %d\n", result);
            System.out.printf("Combinations of characters with biggest ASCII sum is: %d", upperLettersSum);
        }else if (lowerLetterSum == result){
            System.out.printf("Biggest ASCII sum is: %d\n", result);
            System.out.printf("Combinations of characters with biggest ASCII sum is: %d", lowerLetterSum);
        }else  if (otherSum == result){
            System.out.printf("Biggest ASCII sum is: %d\n", result);
            System.out.printf("Combinations of characters with biggest ASCII sum is: %d", otherSum);
        }
    }
}
