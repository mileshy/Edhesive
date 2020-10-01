/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

public class U2_L2_Activity_One{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    System.out.println("What type of item are you buying?");
    String item = scan.nextLine();
    System.out.println("How many are you buying?");
    int qnty = scan.nextInt();
    System.out.println("How much does each one cost?");
    double cost = scan.nextDouble();
    System.out.println(qnty + " " + item + " at $" + cost + " each will cost you $" + (cost*qnty));

  }
}
