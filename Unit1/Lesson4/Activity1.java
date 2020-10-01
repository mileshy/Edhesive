/* Lesson 4 Coding Activity Question 1 */

import java.util.Scanner;

class U1_L4_Activity_One{
  public static void main(String[] args){

     int x = 3 % 5;
     System.out.println( x);


     Scanner scan = new Scanner(System.in);
      System.out.println("Enter starting number (must be an integer)");
      int main = scan.nextInt();
      main++;
      System.out.println("number is now " + main);
      main++;
      System.out.println("number is now " + main);
      main++;
      System.out.println("number is now " + main);
      main--;
      System.out.println("number is now " + main);
      main--;
      System.out.println("number is now " + main);
      main--;
      System.out.println("number is now " + main);

  }
}
