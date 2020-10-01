import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a measurement in inches:");
        double inches = scan.nextDouble();
        double meters = (inches / 12) / 3.281;
        //Truncate to thousandths
        int mTimes1000 = (int)(meters * 1000);
        meters = mTimes1000 / 1000.0;
        System.out.println(inches + " inches = " + meters + " meters");
    }
}
