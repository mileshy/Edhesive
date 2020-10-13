/* Lesson 2 Coding Activity Question 3 */

import java.util.Scanner;

public class U3_L2_Activity_Three{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
      System.out.println("Enter a test score:");
      double first = scan.nextDouble();
        if (first < 0 || first > 100)
          {
               System.out.println("Not Valid");
          }

  }
}
