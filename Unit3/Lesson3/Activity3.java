/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;
import edhesive.testing.Math;
import java.util.concurrent.ThreadLocalRandom;


public class U3_L3_Activity_Three{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
int numb1 = 1 + (int)(Math.random() * ((12 - 1) + 1));
int numb2 = 1 + (int)(Math.random() * ((12 - 1) + 1));
int ans = numb1 * numb2;
System.out.println(numb1 + " * " + numb2 + " = ?");
int main = scan.nextInt();
if (main == ans)
{
  System.out.println("Correct!");
}
else
{
  System.out.println("Wrong");
}
  }
}
