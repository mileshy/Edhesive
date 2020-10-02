/* Assignment 2 - Control Tower */
/* Class name - must be "Assignment2" in order to run */
import java.util.Scanner;
import edhesive.assignment2.Airplane;

public class Assignment2
{
  public static void main(String[] args)

{
Scanner scan = new Scanner(System.in);

Airplane first = new Airplane();
//creates the default airplane//

String plane1 = "\"Airplane 1\": ";
String plane2 = "\"Airplane 2\": ";
//creates two strings for the names of the planes so I can shorten the output later on//

System.out.println("Enter the details of the second airplane (call-sign, distance, bearing and altitude):");
//asks for the details of the second plane//

String callsign = scan.nextLine();
double distance = scan.nextDouble();
int bearing = scan.nextInt();
int altitude = scan.nextInt();
//scans the details of the second plane inputted by the user//

String upcall = callsign.toUpperCase();
//capitalizes the callsign of the second airplane//

Airplane second = new Airplane(upcall,distance,bearing,altitude);
//creates the second airplane using the constructor provided//

System.out.println("\nInitial Positions:");
System.out.println(plane1 + first);
System.out.println(plane2 + second);
double distancediff = second.distTo(first);
int altitudediff = first.getAlt();
System.out.println("The distance between the planes is " + distancediff + " miles.");
System.out.println("The difference in height between the planes is " + altitude + " feet.");
//outputs the initial details of both planes as well as the distance between them and the difference in height//

first.gainAlt();
first.gainAlt();
first.gainAlt();
first.gainAlt();
second.loseAlt();
second.loseAlt();
first.move(10.5, 50);
second.move(8.0, 125);
//directs both planes to their new positions. In this case, plane one gains 4000 feet and plane two loses 2000 feet as well as the new bearing and distance are provided.

System.out.println("\nNew Positions:");
System.out.println(plane1 + first);
System.out.println(plane2 + second);
//outputs the new details of both planes//

int newaltitudeone = first.getAlt();
int newaltitudetwo = second.getAlt();
//uses the getAlt() method to retrieve both of the updated altitudes//

int newaltitudediff = newaltitudetwo - newaltitudeone;
int finalaltdiff = Math.abs(newaltitudediff);
//calculates the difference as well as the absolute value of said difference//

double newdistancediff = second.distTo(first);
//caculates the distance between the first and second plane//

System.out.println("The distance between the planes is " + newdistancediff + " miles.");
System.out.println("The difference in height between the planes is " + finalaltdiff + " feet.");
//outputs both difference in height as well as distance between both planes after said directions are carried out//

}
}
