/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U2_L3_Activity_Three{
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter first word:");
  String first = scan.nextLine();
  System.out.println("Enter second word:");
  String second = scan.nextLine();
  String firsta = first.toLowerCase();
  String secondb = second.toLowerCase();
  int finallytt = firsta.compareTo(secondb);
  System.out.println(finallytt);

  }
}
