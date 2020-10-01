/*
 * Lesson 30 Coding Activity 
 * Due to a problem with a scanner an array of words was created 
 * with spaces in incorrect places. Write the code to process the 
 * list of words and trim any spaces out of the words.
 *
 * So if the list contains:
 *      {"every", " near ing ", " checking", "food ", "stand", "value "}
 *
 * It should be changed to hold:
 *      {"every", "nearing", "checking", "food", "stand", "value"}
 *
 * Note that this activity does not require you to print anything.
 * Your code should end with the array list still declared and
 * containing the resulting words.
 *
 */

class Lesson_30_Activity {
    public static String [] list = {};
    
    public static void main(String[] args)
    {
        for(int i = 0; i < list.length; i++)
        {
            for(int j = 0; j < list[i].length(); j++)
            {
                if(list[i].charAt(j) == ' ')
                {
                    list[i] = list[i].substring(0, j) + list[i].substring(j + 1);
                }
            }
        }
    }
}
