/* Lesson 6 Coding Activity Question 2 */

import java.util.Scanner;

class U1_L6_Activity_Two {
  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a decimal number:");
        Double value = scan.nextDouble();
        System.out.println((int) (value + 0.5));
  }
}
