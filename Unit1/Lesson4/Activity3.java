/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L4_Activity_Three {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
      System.out.println("Enter a radius:");
      double main = scan.nextDouble();
      double circ = main * 2 * 3.14;
      double area = main * main * 3.14;
      System.out.println("Circumference: " + circ);
      System.out.println("Area: " +  area);

  }
}
