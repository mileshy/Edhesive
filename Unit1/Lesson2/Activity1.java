/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

class U1_L2_Activity_One {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String n;


    String a = "CSA";
    String b = a;
    a = "AP";
    System.out.println(a + " " + b);


    System.out.println("What is your name?");
    n = scan.nextLine();
    System.out.println("Hi " + n + ", nice to see you.");
  }
}
