/*
 * Lesson 30 1/2 Coding Activity
 * 
 * For this program you will input an int to represent the octal number
 * and translate to the base ten number. The octal number must be 8 digits or less.
 * 
 * Your program should also check that all the digits are 0 - 7, then translate the
 * number to base ten.
 * 
 * Sample Run 1:
 * Enter a number in base 8:
 * 1287
 * ERROR: Incorrect Octal Format
 * 
 * Sample Run 2:
 * Enter a number in base 8:
 * 123
 * 83
 * 
 * Sample Run 3:
 * Enter a number in base 8:
 * 1111111111
 * ERROR: Incorrect Octal Format
 *
 */

import java.util.Scanner;
import java.lang.Math;

class Lesson_1011_Activity
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number in base 8:");
        int octal = scan.nextInt();
        
        if(("" + octal).length() > 9)
        {
            System.out.println("ERROR: Incorrect Octal Format");
            return;
        }
        
        for(int o = octal; o > 0; o /= 10)
        {
            if(o % 10 >= 8)
            {
                System.out.println("ERROR: Incorrect Octal Format");
                return;
            }
        }
        
        int decimal = 0;
        for(int p = 0; p < 8; p++)
        {
            int o = octal % (int)Math.pow(10, p + 1) / (int)Math.pow(10, p);
            decimal += o * (int)Math.pow(8, p);
        }
        System.out.println(decimal);
    }
}
