/*
 * Lesson 34 Coding Activity 2
 * 
 * For the Lesson 34 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods, 
 * then paste everything into the code runner box. Your submission should 
 * begin with the first import statement and end with the final }.
 * 
 * Write a method that takes an array of ints as a parameter 
 * and returns the average value of the array as a double.
 * 
 *     public static double average(int [] a)
 * 
 * For example, average(a) would return 2.0 
 * if a = {1, 2, 3} or 1.0 if a = {1, 1, 1}.
 */

class Lesson_34_Activity_Two
{
    public static double average(int [] a)
    {
        int sum = 0;
        for(int i = 0; i < a.length; i++)
        {
            sum += a[i];
        }
        return (double)sum / a.length; 
    }
    
    public static void main(String[] args)
    {
    }
}
