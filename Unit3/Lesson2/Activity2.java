/* Lesson 2 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L2_Activity_Two{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter two numbers;");
    double first = scan.nextDouble();
    double first2 = scan.nextDouble();
if (first >= first2)
{
  System.out.println("Largest is: " + first);
}
    if (first2 > first)
{
  System.out.println("Largest is: " + first2);
}
  }
}
