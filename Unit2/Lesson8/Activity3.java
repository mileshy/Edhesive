/* Lesson 8 Coding Activity Question 3 */

import java.util.Scanner;
import java.io.*;
import static java.lang.System.*;
import java.lang.Math;

public class U2_L8_Activity_Three{
  public static void main(String[] args){

            Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int ex = Math.abs(a-b);
        System.out.println("The difference is: " + ex);

  }
}
