/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U1_L3_Activity_Three{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Java is a programming language, true or false?");
    boolean a = scan.nextBoolean();
    System.out.println("Only numbers can be stored by variables in Java, true or false?");
    boolean b = scan.nextBoolean();
    System.out.println("There are only 2 possible values which can be held by a boolean variable, true or false?");
    boolean c = scan.nextBoolean();
    System.out.println("Question 1 - Your answer: " + a + ". Correct answer: true");

    System.out.println("Question 2 - Your answer: " + b + ". Correct answer: false");

    System.out.println("Question 3 - Your answer: " + c + ". Correct answer: true");



  }
}
