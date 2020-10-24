/* Lesson 3 Coding Activity Question 4 */

import java.util.Scanner;

public class U3_L3_Activity_Four{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("What is the temperature?");
    double grade = scan.nextDouble();
if (grade < 99)
{
  System.out.println("WARNING");
}
else if (grade > 102)
{
  System.out.println("WARNING");
}
else
{
  System.out.println("Temperature is OK");
}

  }
}
