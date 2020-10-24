/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

public class U3_L4_Activity_Three{
  public static void main(String[] args){
       Scanner scan = new Scanner (System.in);
       int f1t = 0;
       int f2t = 0;
       int f3t = 0;
       int f4t = 0;
          System.out.println("Please enter the first octet:");
            int f1 = scan.nextInt();
          System.out.println("Please enter the second octet:");
            int f2 = scan.nextInt();
          System.out.println("Please enter the third octet:");
            int f3 = scan.nextInt();
          System.out.println("Please enter the fourth octet:");
            int f4 = scan.nextInt();

            if (f1 >= 0 && f1 <= 255)
              {
                f1t = 1;
              }
            else
              {
                System.out.println("Octet 1 is incorrect");
              }
            if (f2 >= 0 && f2 <= 255)
              {
                f2t = 1;
              }
            else
              {
                System.out.println("Octet 2 is incorrect");
              }
            if (f3 >= 0 && f3 <= 255)
              {
                f3t = 1;
              }
            else
              {
                System.out.println("Octet 3 is incorrect");
              }
            if (f4 >= 0 && f4 <= 255)
              {
                f4t = 1;
              }
            else
              {
                System.out.println("Octet 4 is incorrect");
              }
            int check = f1t + f2t + f3t + f4t;
            if (check == 4)
              {
                System.out.println("IP Address: " + f1 + "." + f2 + "." + f3 + "." + f4);
              }
  }
}
