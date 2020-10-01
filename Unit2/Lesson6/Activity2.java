/* Lesson 6 Coding Activity Question 2 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U2_L6_Activity_Two{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter radius:");
    double radius = scan.nextDouble();
    Circle main = new Circle(radius);
    System.out.println("Area: " + main.getArea());
    System.out.println("Radius is being doubled...");
    double second =  main.getRadius() * 2;
    main.setRadius(second);
    System.out.println("Area: " + main.getArea());

  }
}
