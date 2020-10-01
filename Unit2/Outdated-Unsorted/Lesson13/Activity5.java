/*
 * Lesson 13 Coding Activity 5 
 * Create a program to let the user practice their multiplication tables.
 * Print two random integers between 1 and 12 each on a new line. 
 * Then, ask the user to input the multiplication of the two numbers. 
 * If they enter the correct product print "Correct!" otherwise print "Wrong".
 */

import java.util.Scanner;
import java.lang.Math;

class Lesson_13_Activity_Five {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = (int)(Math.random() * 12) + 1;
        int b = (int)(Math.random() * 12) + 1;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println("Enter the product of the two numbers:");
        int product = scan.nextInt();
        
        if(product == a * b)
        {
            System.out.println("Correct!");
        }
        else
        {
            System.out.println("Wrong");
        }
    }
}
