/*
 *Assignment 2, Time Converter
 *
 *For this assignment, write a program that finds the date based on a given Unix timestamp. The Unix timestamp is a system for tracking the age of files using the number of seconds that have occurred since the Unix epoch at 12:00:00 AM on January 1st,1970. We will be assuming there are always 30 days per month (360 days a year) to simplify the calculation.
 *
 *For input, the program should accept an integer number of seconds to convert.
 *
 *The program should then calculate the year, month, day, hour, minute, and second based on the inputted timestamp. Format your outputs as shown in the sample runs. Make sure that your spacing matches the sample runs exactly.

Months are represented by numbers ranging from 0 to 11. Days range from 0 to 29. For example, 0 is January, 1 is February, etc. and 0 is the first day of the month, 1 is the second day of the month, etc.
 *Sample Run:
Seconds Since Unix Epoch:
999999999

Year: 2002
Month: 1
Day: 24
Hour: 1
Min: 46
Sec: 39
*/

import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        int secondsPerMinute = 60;
        int secondsPerHour = secondsPerMinute * 60;
        int secondsPerDay = secondsPerHour * 24;
        int secondsPerMonth = secondsPerDay * 30;
        int secondsPerYear = secondsPerMonth * 12;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Seconds Since Unix Epoch:");
        int second = scan.nextInt();
        
        int year = second / secondsPerYear;
        second %= secondsPerYear;
        
        int month = second / secondsPerMonth;
        second %= secondsPerMonth;
        
        int day = second / secondsPerDay;
        second %= secondsPerDay;
        
        int hour = second / secondsPerHour;
        second %= secondsPerHour;
        
        int minute = second / secondsPerMinute;
        second %= secondsPerMinute;
        
        System.out.println();
        System.out.println("Year: " + (1970 + year));
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Min: " + minute);
        System.out.println("Sec: " + second);
    }
}
