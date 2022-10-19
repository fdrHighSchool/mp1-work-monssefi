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
    System.out.println("how many characters long do you want your random password to be");
    int length1 =s.nextInt();
    String lowcase = s.nextLine().toLowerCase();
    // test output
    if (user.equals("student")){//If the user types student it will set up the gmail in the student format
     System.out.println("The school gmail you made is " + (firstName) + initial(lastName) + (num)+"@nycstudents.net");
    }
     else //Other wise if user typs teacher it will set up the gmail in the teacher format 
      System.out.println("The school gmail you made is " + initial(firstName)+(lastName) + (num)+"@schools.nyc.gov");
      s.close();
      System.out.println("Your password strength: " + getPasswordStrength(length));
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
    public static void len(String[] length) {
	//Randomly generate a character for the password length number of times
      for(int l = 0; l < length; l++) {
      //random lowercase or UPPERCASE character to our randomPassword String
          password += gp();
       }//Add the random password
         password[l] = gp;
       }
      
    public static String gp(){
     String password = "";
     int rand=(int)(Math.random()*(90-65)+65);
     char c =(char)(rand);
        if(rand <= 9) {
	  //Number (48-57 in ASCII)
	  //To convert from 0-9 to 48-57, we can add 48 to rand because 48-0 = 48
	  int number = rand + 48;
	  //This way, rand = 0 => number = 48 => '0'
	  return (char)(number);
       } else if(rand <= 35) {
	  //Uppercase letter (65-90)
	  //To convert from 10-35 to 65-90, we can add 55 to rand because 65-10 = 55
	  int uppercase = rand + 55;
	  //This way, rand = 10 => uppercase = 65 => 'A'
	  return (char)(uppercase);
        } else {
	  //Lowercase letter (97-122)
	  //To convert from 36-61 to 97-122, we can add 61 to rand because 97-36 = 61
	  int lowercase = rand + 61;
	  //This way, rand = 36 => lowercase = 97 => 'a'
	  return (char)(lowercase);
          System.out.println(rand+" "+c);
          return password;
       }
    }
    public static String gps(int length) {
      if(length < 5) {
	return "weak";
      } else if(length < 10) {
	 return "medium";
	} else {
	  return "strong";
        }
  }
}// end class
