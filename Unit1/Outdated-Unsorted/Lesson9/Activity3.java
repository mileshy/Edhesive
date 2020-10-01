/*
 * Lesson 9 Coding Activity Question 3
 *
 * Write the code to print a random integer from 20 to 40 inclusive using Math.random().
 *
*/

import java.lang.Math;

class Lesson_9_Activity_Three {
    public static void main(String[] args) {
        System.out.println((int)(Math.random() * 21) + 20);
    }
}
