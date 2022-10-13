import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);
    String teacher =("teacher");
    String student =("student");
    System.out.println("Are you a teacher or student: ");
    String user =s.nextLine();
    
    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("Enter your favorite number: ");
    String num =s.nextLine();
    // test output
    if (user.equals("student")){
     System.out.println("The school gmail you made is " + (firstName) + initialize(lastName) + (num)+"@nycstudents.net");
    }
     else user.equals("teacher");{
      System.out.println("The school gmail you made is " + initialize(lastName) + (num)+"@gmail.com");
    s.close();
    } 
    // end main method
}
  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String initialize(String n) {
    return n.substring(0, 1);
  } // end initialize method

} // end class