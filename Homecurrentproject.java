import java.util.Scanner;
import java.util.Random;
class test {
  public static void main(String[] args) {
        
        //Create a Scanner (import it above!) and ask the user how many random passwords they want generated
       Scanner s = new Scanner(System.in);
            
        String teacher =("teacher");
        
        String student =("student");
        
        System.out.println("Are you creating a teacher account or student account if yes then type teacher or student: ");
        
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
           System.out.println();
            //Ask the user how long they want their random passwords to be
           System.out.print("How long do you want your random passwords to be? ");
            
           int len = s.nextInt();
    
           System.out.println("The password is "+gp(len));
        
           System.out.println();
        
           System.out.println("Your password strength: " + gps(len));
        s.close();
      }
    
  
    public static String initial(String n) {
     return n.substring(0, 1);
  } // end initialize method

    
    //Create a function that randomly generates a letter (lowercase or uppercase) or number (0-9) using ASCII
    //'0' - '9' => 48-57 in ASCII
    //'A' - 'Z' => 65-90 in ASCII
    //'a' - 'z' => 97-122 in ASCII
    //sybmols => 33-47 in ASCII
    public static String gp(int length) {
        String password="";
        int min, max;

      for(int i = 0; i < length; i++) {
          // generate a random number
          // 65 - 90 capital letter
          // 97 - 122 lower case
          // 33 - 47 special symbols
          int choice = (int)(Math.random()*(3) + 1);
    
          if (choice == 1) {
            min = 65;
            max = 90;
          }
    
          else if (choice == 2) {
            min = 97;
            max = 122;
          }
    
          else {
            min = 33;
            max = 47;
          }
    
          int rand = (int)(Math.random()*(max-min+1) + min);
    
          // convert the int ---> character c =(char)i;
          char c = (char)rand;
          // System.out.println(rand + " " + c);
    
          // add the char to the password String
          password = password + c; // password += c;);
                           
           }    
           return password;
        }
        
       

                    
          
        
            
    
    //EXTENSION!!
    //Create a function that returns the password strength ("weak", "medium", "strong") based on the password length
    public static String gps(int length) {
        String level ="";
        if(length >= 17 || length == 100) {
            level +="Strong";
        } else if(length >= 10 || length == 15) {
            level +="Medium";
        } else {
            level += "Weak";
        }
        return level;
    }

}
