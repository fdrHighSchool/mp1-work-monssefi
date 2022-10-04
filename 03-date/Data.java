
/**
 * Write a description of class Data here.
 *
 * @author (Monseff)
 * @version (a version number or a date)
 */

import java.util.Scanner;  // Import the Scanner class

public class Data
{
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);// Create a Scanner object

        System.out.println("whats ur user? ");
        String user = s.nextLine();

        System.out.println(user+" Enter the day of the week: ");  
        String Day = s.nextLine(); 

        System.out.println(user+" Enter the month: ");  
        String month = s.nextLine(); 

        System.out.println(user+" Enter the day of the month: ");  
        String dayofthemonth = s.nextLine(); 

        System.out.println(user+" Enter the year: ");  
        String year = s.nextLine(); 
        System.out.println("American format: "+Day+", "+month+" "+dayofthemonth+", "+year); 
        System.out.println("European format: "+Day +" "+ dayofthemonth+" "+month+" "+year);
    }
}
