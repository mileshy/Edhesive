/*
 * Lesson 7 Coding Activity Question 2
 *
 * Change the last problem so that it also prints the sum of the digits. 
 * Use the format shown below.
 *
 * Make sure your output is printed in the same order as the sample run.
 *
 * Sample run:
 
Please enter a three digit number:
678

Here are the digits:
6
7
8

6 + 7 + 8 = 21

*/

import java.util.Scanner;

class Lesson_7_Activity_Two {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a three digit number:");
        int number = scan.nextInt();
        
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;
        
        System.out.println("Here are the digits:");
        System.out.println(hundreds);
        System.out.println(tens);
        System.out.println(ones);
        
        System.out.println("\n" + hundreds + " + " + tens + " + " + ones + " = " + (hundreds + tens + ones));
    }
}
