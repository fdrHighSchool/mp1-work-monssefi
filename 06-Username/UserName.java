import java.util.Scanner;
import java.util.Random;
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
    String lowcase = s.nextLine().toLowerCase();
    // test output
    if (user.equals("student")){//If the user types student it will set up the gmail in the student format
     System.out.println("The school gmail you made is " + (firstName) + initial(lastName) + (num)+"@nycstudents.net");
    }
     else //Other wise if user typs teacher it will set up the gmail in the teacher format 
      System.out.println("The school gmail you made is " + initial(firstName)+(lastName) + (num)+"@schools.nyc.gov");
      s.close();
    System.out.println("how many characters long do you want yiur random password to be");
    int length =s.nextInt();
    gp(0);
  }// end main method

  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  
  /*
   * Name:genaratepassword
   * Purpose: send back a random string  of numbers
   * Input: a name (String)
   * Return: sring
   */
  public static String initial(String n) {
    return n.substring(0, 1);
   } // end initialize method
   public static String gp(int length){
    String password = "";
    int rand=(int)(Math.random()*(90-65)+65);
    char c =(char)(rand);
    System.out.println(rand+" "+c);
    return password;
   }
} // end class