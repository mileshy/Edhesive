/*
 * Lesson 9 Coding Activity Question 1
 *
 * Write the code to print a random integer from 1 to 10 inclusive using Math.random().
 *
*/

import java.lang.Math;

class Lesson_9_Activity_One {
    public static void main(String[] args) {
        System.out.println((int)(Math.random() * 10) + 1);
    }
}
