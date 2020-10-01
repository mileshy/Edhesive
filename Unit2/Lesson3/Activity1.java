/* Lesson 3 Coding Activity Question 1 */

import java.util.Scanner;

public class U2_L3_Activity_One{
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  String main = scan.nextLine();
  int test = main.length();
  String first = main.substring(0,1);
  String second = main.substring((test - 1));
  System.out.println(first + second);
  }
}
