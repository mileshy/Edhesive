/* Lesson 2 Coding Activity Question 4 */

import java.util.Scanner;

public class U3_L2_Activity_Four{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
      System.out.println("What is the temperature?");
      double first = scan.nextDouble();
        if (first < 99 || first > 102)
          {
               System.out.println("WARNING");
          }

  }
}
