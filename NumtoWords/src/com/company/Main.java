package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer value");
        int numberToConvert = scanner.nextInt();
        scanner.nextLine();
        numberToWords(numberToConvert);
    }

    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.println("Invalid value;");
        }
        //Convert the number to a string and then to a char array and look at each char in turn from left to right
        char[] reversedNumberString = new StringBuilder(Integer.toString(number)).toString().toCharArray();

        StringBuilder convertedNumber = new StringBuilder();

        for(char c: reversedNumberString){
            switch (c) {
                case '0':
                    convertedNumber.append("zero ");
                    break;
                case '1':
                    convertedNumber.append("one ");
                    break;
                case '2':
                    convertedNumber.append("two ");
                    break;
                case '3':
                    convertedNumber.append("three ");
                    break;
                case '4':
                    convertedNumber.append("four ");
                    break;
                case '5':
                    convertedNumber.append("five ");
                    break;
                case '6':
                    convertedNumber.append("six ");
                    break;
                case '7':
                    convertedNumber.append("seven ");
                    break;
                case '8':
                    convertedNumber.append("eight ");
                    break;
                case '9':
                    convertedNumber.append("nine ");
                    break;
            }
            System.out.println(convertedNumber);
        }
    }
}
