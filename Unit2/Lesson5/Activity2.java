/* Lesson 5 Coding Activity Question 2 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U2_L5_Activity_Two{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    System.out.println("Type a radius:");
    double fart = scan.nextDouble();
    Circle first = new Circle(fart);
    System.out.println("Type a length:");
    double fartt = scan.nextDouble();
    System.out.println("Type a width:");
    double farttt = scan.nextDouble();
    Rectangle r = new Rectangle(fartt, farttt);
    System.out.println(first);
    System.out.println(r);
  }
}
