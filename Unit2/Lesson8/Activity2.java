/* Lesson 8 Coding Activity Question 2 */

import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;


public class U2_L8_Activity_Two{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter distance east:");
    Double a = scan.nextDouble();
    System.out.println("Enter distance north:");
    Double b = scan.nextDouble();
    double transfer = Math.pow(a, 2) + Math.pow(b, 2);
    double c = Math.sqrt(transfer);
    System.out.println("Distance between points: " + c);
  }
}
