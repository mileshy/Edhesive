import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer between 0 and 1000:");
        int number = scan.nextInt();
        
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;
        
        System.out.println("The sum of the digits is " + (hundreds + tens + ones) + ".");
    }
}
