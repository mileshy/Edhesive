/* Assignment 1 - Movie Ratings */
import java.util.Scanner;

class Assignment1 {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter the movie name");
      String name = scan.nextLine();

      System.out.println(" ");

      System.out.println("Please enter the running time in minutes.");
      int runtime = scan.nextInt();

      System.out.println(" ");

      System.out.println("Please enter ratings from the movie review website.");
      int rev1 = scan.nextInt();
      int rev2 = scan.nextInt();
      int rev3 = scan.nextInt();

      System.out.println(" ");

      System.out.println("Please enter ratings from the focus group.");
      double foc1 = scan.nextDouble();
      double foc2 = scan.nextDouble();

      System.out.println(" ");

      System.out.println("Please enter the average movie critic rating.");
      double critic = scan.nextDouble();

      int hrs = runtime / 60;
      int mins = runtime % 60;
      double averageWebsite = (rev1 + rev2 + rev3) / 3.0;
      double averageFocus = (foc1 + foc2) / 2.0;

      System.out.println(" ");

      System.out.println("Title: " + name);
      System.out.println("Running time: " + hrs + "h" + mins);
      System.out.println("Average website rating: " + averageWebsite);
      System.out.println("Average focus group rating: " + averageFocus);
      System.out.println("Average movie critic rating: " + critic);


      double over = (0.2 * averageWebsite) + (0.3 * averageFocus) + (0.5 * critic);

      int overall = (int)(over + 0.5);

      System.out.println("Overall movie rating: " + (int)overall);

  }
}
