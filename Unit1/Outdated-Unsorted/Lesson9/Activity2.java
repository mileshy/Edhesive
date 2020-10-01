/*
 * Lesson 9 Coding Activity Question 2
 *
 * Write the code to print a random integer from -20 to 20 inclusive using Math.random().
 *
*/

import java.lang.Math;

class Lesson_9_Activity_Two {
    public static void main(String[] args) {
        System.out.println((int)(Math.random() * 41) - 20);
    }
}
