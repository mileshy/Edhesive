/* Lesson 6 Coding Activity Question 1 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U2_L6_Activity_One{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number of sides:");
    int sides = scan.nextInt();
    System.out.println("Enter side length:");
    double length = scan.nextDouble();
    RegularPolygon main = new RegularPolygon(sides, length);
    System.out.println("A " + main + " has perimeter " + 	main.getPerimeter() + " and area " + 	main.getArea());

  }
}
