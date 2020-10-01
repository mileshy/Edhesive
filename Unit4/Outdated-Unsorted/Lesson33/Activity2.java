/*
 * Lesson 33 Coding Activity 2
 * 
 * For the Lesson 33 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods, 
 * then paste everything into the code runner box. Your submission should 
 * begin with the first import statement and end with the final }.
 *  
 * For questions 2-5, you may want to start with the printIt method 
 * and use it to test the other three.
 *  
 * Write a method that takes an array of ints and stores random numbers
 * between 10 and 99 in the array. Use Math.random() to generate
 * random numbers and convert them to integers between 10 and 99 inclusive.
 * 
 * This method must be called randomize() and it must take an int[] parameter. 
 * 
 */

import java.lang.Math;

class Lesson_33_Activity_Two {
  
    public static void randomize(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i] = (int)(90 * Math.random()) + 10;
        }
    }
    
    public static void main(String[] args)
    {
    }
}
