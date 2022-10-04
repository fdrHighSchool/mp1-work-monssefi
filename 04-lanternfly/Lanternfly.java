import java.util.Scanner;

/**
 * Write a description of class Lanternfly here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lanternfly
{
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
           
        System.out.print("There are multiple Enivornmental problems to solve and ");
        System.out.println("so many trees and nature are affected by pollution ");
        System.out.println("Lots of people try to save trees and nature by protesting ");

        System.out.print("\u001B[34m"+"How many trees did u save? "+"\u001B[0m");
        int num = input.nextInt();
        
        if (num < 10 || num == 10 ) {
            System.out.println("Small amount!");
        }
        else {
            System.out.println("Huge amount");
        }
    }
}