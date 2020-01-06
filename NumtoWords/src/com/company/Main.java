package com.company;

public class Main {

    public static void main(String[] args) {
            numberToWords(100);

    }

    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.println("Invalid value;");
        }
        number = reverse(number);

        //int originalCount = getDigitCount(number);
        //int reversedCount = getDigitCount(reverse(number));
        number = reverse(number);
        while(number > 0) {

            int separateDigit = number % 10;
            number = number / 10;



            switch (separateDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Se;ven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;

            }

// a failed attempt at getting this code to print the zeroes of numbers like 100 or 001
//            if(originalCount != reversedCount) {
//                for (int i = reversedCount; i < originalCount; i++) {
//                    System.out.println("Zero");
//                }
//            }
        }

    }


    public static int reverse(int num) {
        int reversed = 0;
        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }


    public static int getDigitCount (int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int digits = 0;
        while (number > 0) {
            digits += 1;
            number /= 10;
        }
        System.out.println(digits);
        return digits;
    }

}

