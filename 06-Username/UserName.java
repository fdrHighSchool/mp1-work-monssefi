import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);
    // get String input from user
    String teacher =("teacher");
    String student =("student");
    System.out.println("Are you a teacher or student: ");
    String user =s.nextLine(); 
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("Enter your favorite number: ");
    String num =s.nextLine();
    // test output
    if (user.equals("student")){//If the user types student it will set up the gmail in the student format
     System.out.println("The school gmail you made is " + (firstName) + initial(lastName) + (num)+"@nycstudents.net");
    }
     else //Other wise if user typs teacher it will set up the gmail in the teacher format 
      System.out.println("The school gmail you made is " + initial(firstName)+(lastName) + (num)+"@schools.nyc.gov");
    s.close();
    
  }// end main method

  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String initial(String n) {
    return n.substring(0, 1);
   } // end initialize method

} // end class