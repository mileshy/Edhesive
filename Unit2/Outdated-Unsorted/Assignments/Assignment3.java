/*
 *Assignment 3, Crack the Code!
 *
 *In this assignment, you will be creating a program that requires a secret code to “unlock.” The program should first welcome the user and ask the user to input his/her name. Then the program will greet the user using the entered name.
 *
 *In order to “crack the code,” the user must input three integer numbers which satisfy the following conditions:
 *The first number must be the number 3.
 *The second number can either be the number 1 or be between 33 and 100, inclusive.
 *The third number must be a positive number that is either evenly divisible by 3 or evenly divisible by 7
 *
 *As the user enters each number, the program should immediately check whether or not the number satisfies its respective requirement(s) listed above. If the requirement(s) is satisfied, then a “Correct!” confirmation should be printed out. If the requirement(s) is NOT satisfied, then an error message should be printed out, and the user cannot input any more numbers. (i.e. if the user input 5 as the first number, then the user has failed to crack the code, and cannot guess the second or third number.)
 *
 *Please refer to the sample outputs below for formatting. (Any output statements from the program must match the sample formatting exactly.)
 *
 *Sample Run 1:

Welcome. What is your name?
Jane Doe
Hello Jane Doe. Try your best to crack the code!

PHASE 1
Enter a number:
3
Correct!

PHASE 2
Enter a number:
40
Correct!

PHASE 3
Enter a number:
6
Correct!
You have cracked the code! 
 *Sample Run 2:

Welcome. What is your name?
Jane Doe
Hello Jane Doe. Try your best to crack the code!

PHASE 1
Enter a number:
0
Sorry, that was incorrect!
Better luck next time!
 *Sample Run 3:

Welcome. What is your name?
John Doe
Hello John Doe. Try your best to crack the code!

PHASE 1
Enter a number:
3
Correct!

PHASE 2
Enter a number:
2
Sorry, that was incorrect!
Better luck next time!
*/

import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome. What is your name?");
        String name = scan.nextLine();
        System.out.println("Hello " + name + ". Try your best to crack the code!");
        System.out.println();
        
        System.out.println("PHASE 1");
        System.out.println("Enter a number:");
        int phase1 = scan.nextInt();
        if(phase1 == 3)
        {
            System.out.println("Correct!");
            System.out.println();
            System.out.println("PHASE 2");
            System.out.println("Enter a number:");
            int phase2 = scan.nextInt();
            if(phase2 == 1 || (33 <= phase2 && phase2 <= 100))
            {
                System.out.println("Correct!");
                System.out.println();
                System.out.println("PHASE 3");
                System.out.println("Enter a number:");
                int phase3 = scan.nextInt();
                if(phase3 > 0 && (phase3 % 3 == 0 || phase3 % 7 == 0))
                {
                    System.out.println("Correct!");
                    System.out.println("You have cracked the code!");
                }
                else
                {
                    System.out.println("Sorry, that was incorrect!");
                    System.out.println("Better luck next time!");
                }
            }
            else
            {
                System.out.println("Sorry, that was incorrect!");
                System.out.println("Better luck next time!");
            }
        }
        else
        {
            System.out.println("Sorry, that was incorrect!");
            System.out.println("Better luck next time!");
        }
    }
}
