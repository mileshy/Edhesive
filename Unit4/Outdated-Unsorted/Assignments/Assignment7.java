import java.util.Scanner;
import java.lang.Math;

public class Main
{
    private static String duplicate(String str)
    {
        int n = str.length();
        if(n % 2 == 0)
        {
            n *= 2;
        }
        String acc = "";
        for(int i = 0; i < str.length(); i++)
        {
            for(int j = 0; j < n; j++)
            {
                acc += str.charAt(i);
            }
        }
        return acc;
    }
    
    private static boolean isEdhesivePalindrome(String str)
    {
        if(str.length() <= 3 || str.length() >= 15)
        {
            return false;
        }
        str = str.toLowerCase();
        for(int i = 0; i < str.length() / 2; i++)
        {
            char a = str.charAt(i);
            char b = str.charAt(str.length() - i - 1);
            
            if(a == '4') a = 'a';
            if(b == '4') b = 'a';
            
            if(a == '3') a = 'e';
            if(b == '3') b = 'e';
            
            if(a == '0') a = 'o';
            if(b == '0') b = 'o';
            
            if(a != b)
            {
                return false;
            }
        }
        return true;
    }
    
    private static double numberScramble(double num)
    {
        if(num < 0) return 0;
        return Math.sqrt((num + 5) / 2);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Methods Sampler Platter. Please enter a String to duplicate.");
        System.out.println("The duplicated String is: " + duplicate(scan.nextLine()));
        System.out.println("Next, please enter a String to check for Edhesive Palindromes.");
        System.out.println(isEdhesivePalindrome(scan.nextLine()) ? "Nice, you found an Edhesive Palindrome!" : "Too bad, that isn't an Edhesive Palindrome.");
        System.out.println("Almost done! Please enter a number to scramble.");
        System.out.println("The scrambled number is: " + numberScramble(scan.nextDouble()));
    }
}
