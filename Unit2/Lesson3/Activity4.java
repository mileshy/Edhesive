/* Lesson 3 Coding Activity Question 4 */

import java.util.Scanner;

public class U2_L3_Activity_Four{
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
      System.out.println("Enter a sentence:");
      String main = scan.nextLine();
      int i = main.indexOf(' ');
      String word = main.substring(0, i);
      System.out.println(word.length());
  }
}
