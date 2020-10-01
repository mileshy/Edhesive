/* Lesson 8 Coding Activity Question 1 */

import java.util.Scanner;
import edhesive.testing.Math;

public class U2_L8_Activity_One{
  public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int range = scan.nextInt();
int min = 1;
int answer1 = (int) (Math.random() * range) + min;
int answer2 = (int) (Math.random() * range) + min;
int answer3 = (int) (Math.random() * range) + min;
int answer4 = (int) (Math.random() * range) + min;
int answer5 = (int) (Math.random() * range) + min;
int answer6 = (int) (Math.random() * range) + min;
int answer7 = (int) (Math.random() * range) + min;
int answer8 = (int) (Math.random() * range) + min;
int answer9 = (int) (Math.random() * range) + min;
int answer10 = (int) (Math.random() * range) + min;
System.out.println(answer1 + "\n" + answer2 + "\n" + answer3 + "\n" + answer4 + "\n" + answer5 + "\n" + answer6 + "\n" + answer7 + "\n" + answer8 + "\n" + answer9 + "\n" + answer10);

  }
}
