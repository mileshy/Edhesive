import java.util.Scanner;
import java.util.ArrayList;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        
        System.out.println("Please enter words, enter STOP to stop the loop.");
        String word = scan.nextLine();
        while(!word.equals("STOP"))
        {
            list.add(word);
            word = scan.nextLine();
        }
        
        System.out.println();
        for(String w : list)
        {
            if(w.indexOf('a') != -1)
            {
                System.out.println(w);
            }
        }
    }
}
