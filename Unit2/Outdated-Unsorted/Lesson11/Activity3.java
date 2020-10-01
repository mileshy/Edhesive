/*
 * Lesson 11 Coding Activity 3
 * Get two integers from the keyboard and test if they are equal.
 * If they are, print "YES" (without the quotes).
*/

import java.util.Scanner;

class Lesson_11_Activity_Three {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a == b)
        {
            System.out.println("YES");
        }
    }
}
