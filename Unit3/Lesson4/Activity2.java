/* Lesson 4 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L4_Activity_Two{
  public static void main(String[] args){
     Scanner scan = new Scanner (System.in);
     int x = scan.nextInt();
      int y = scan.nextInt();
   if (x >= 0 && y >= 0 )
{
  System.out.println("Both are positive or zero.");
}
else {
System.out.println("One or both are negative.");
  }
}}
