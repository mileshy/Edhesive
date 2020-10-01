/*
 * Lesson 11 Coding Activity 4
 * Test if an integer input from the keyboard is odd or even.
 * 
 *     Sample Run 1:
 *        Enter a Number:
 *        78
 *        Even
 * 
 *     Sample Run 2:
 *        Enter a Number:
 *        17
 *        Odd
 * 
 */

import java.util.Scanner;

class Lesson_11_Activity_Four {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if(i % 2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
