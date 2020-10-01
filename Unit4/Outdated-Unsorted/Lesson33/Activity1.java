/*
 * Lesson 33 Coding Activity 1
 * 
 * For the Lesson 33 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods, 
 * then paste everything into the code runner box. Your submission should 
 * begin with the first import statement and end with the final }.
 * 
 * For questions 2-5, you may want to start with the printIt method 
 * and use it to test the other three.
 * 
 * Write a method that takes an array of Strings and changes each of the Strings to UPPER CASE.  
 * 
 * This method must be called upper() and it must take a String[] parameter.
 * 
 * Use T1_L33_Reference_Tempate.java, which is included in this folder, 
 * as a reference. 
 * 
 */

class Lesson_33_Activity_One {
  
    public static void upper(String[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i] = array[i].toUpperCase();
        }
    }
  
    public static void main(String[] args)
    {
    }
}
