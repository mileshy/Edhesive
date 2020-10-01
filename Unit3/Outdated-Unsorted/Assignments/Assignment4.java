import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the message to be shortened");
        String message = scan.nextLine();
        
        System.out.println();
        if(message.length() < 10)
        {
            System.out.println("This doesn't need shortening!");
            return;
        }
        
        message = message.toLowerCase();
        
        String noDuplicates = removeDuplicates(message);
        String noVowels = noDuplicates.replaceAll("\\B([aeiou])", "");
        
        System.out.println("Shortened message: " + noVowels);
        System.out.println("Repeated letters removed: " + (countNonVowelDuplicates(message) - countNonVowelDuplicates(noVowels)));
        System.out.println("Vowels removed: " + (countVowels(message) - countVowels(noVowels)));
        System.out.println("Total characters saved: " + (message.length() - noVowels.length()));
    }
    
    static boolean isVowel(char c)
    {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
    static int countVowels(String message)
    {
        int vowels = 0;
        for(int i = 0; i < message.length(); i++)
        {
            if(isVowel(message.charAt(i)))
            {
                vowels++;
            }
        }
        return vowels;
    }
    
    static int countNonVowelDuplicates(String message)
    {
        int duplicates = 0;
        for(int i = 1; i < message.length(); i++)
        {
            if(!isVowel(message.charAt(i)) && message.charAt(i) == message.charAt(i - 1))
            {
                duplicates++;
            }
        }
        return duplicates;
    }
    
    static String removeDuplicates(String message)
    {
        String noDuplicates = "";
        for(int i = 0; i < message.length(); i++)
        {
            char atI = message.charAt(i);
            if(i == 0 || message.charAt(i - 1) != atI || isVowel(atI))
            {
                noDuplicates += atI;
            }
        }
        return noDuplicates;
    }
}
