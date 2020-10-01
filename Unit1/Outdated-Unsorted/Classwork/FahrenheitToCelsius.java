import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a temperature in °F:");
        double f = scan.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println(f + " °F = " + c + " °C");
    }
}
