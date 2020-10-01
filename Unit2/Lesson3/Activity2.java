/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L3_Activity_Two{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a string;");
    String main = scan.nextLine();
    int length = (main.length() - 1);

    String finals = main.substring(1, length);
    System.out.println(finals);
  }
}
