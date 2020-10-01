/* Lesson 6 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L6_Activity_Three {
  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a decimal number:");
        double decimal = scan.nextDouble();
        int times100 = (int)(decimal * 100);
        int hundredths = times100 % 100;
        int final1 = hundredths / 10;
        int final2 = hundredths % 10;

        System.out.println(final1 + " " + final2);
  }
}
