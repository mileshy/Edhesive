/* Lesson 1 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L1_Activity_Two{
  public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String password = "letmein";
        System.out.println("Default password is " + password);
        System.out.println("Type a new password");
        password = scan.nextLine();
        System.out.println("The new password is " + password);


  }
}
