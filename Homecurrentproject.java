import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    String point1, point2;
    
    boolean isValid;
    
       
    do {
       
      System.out.print("Please enter a point in the form (x, y): ");
      
      System.out.println(" ");
      point1 = s.nextLine();

      isValid = checkInput(point1);
      if (isValid != true) {
        System.out.println("Incorrect form try again!");
      }
    } while (isValid != true);

    do {
      System.out.print("Please enter a second point: ");
      
      System.out.println(" ");
      point2 = s.nextLine();
      isValid = checkInput(point2);
      if (isValid != true) {
        System.out.println("Incorrect form try again!");
      }
    } while (isValid != true);

    System.out.println("Choose any number for height: ");
    
    int h= s.nextInt();   

    System.out.println("Choose any number for radius: ");

    int r= s.nextInt();
    
    int x1 = getX(point1);
    
    int x2 = getX(point2);
    
    System.out.println("The x values are "+x1 + " and " + x2);
    q(x1, x2); 
    
    System.out.println(" ");
    
    int y1 = getY(point1);
    
    int y2 = getY(point2);
    
    System.out.println("The y values are "+y1 + " and " + y2);
    q(y1, y2);
    System.out.println(" ");
    
    System.out.println("The eudclidean distance between "+"("+(x1+", "+y1)+")"+" and "+"("+(x2+","+y2)+")"+" is "+eudclideanDistance(x1, y1, x2, y2));
    
    System.out.println(" ");
    
    System.out.println("The taxicab distance between "+"("+(x1+", "+y1)+")"+" and "+"("+(x2+","+y2)+")"+" is "+taxicabDistance(x1,y1,x2, y2));
  } // end main method

  


  public static boolean checkInput(String p) {
    boolean result = true;
    
    if (p.indexOf("(") != 0) {
      result = false;
    } // end first if statement
    // is there a comma and space?
    if (p.indexOf(", ") == -1) {
      result = false;
    } // end second if statement
    // is the closing parentesis last?
    if (p.indexOf(")") != p.length() - 1) {
      result = false;
    } // end third if statement

    return result;
   } // end checkInput method

  
  public static int getX(String XX) {
  
    int comma = XX.indexOf(",");

    
    String x = XX.substring(1, comma);


    return Integer.parseInt(x);
   } // end getX method

  
  public static int getY(String YY) {
    // determine where the comma is located
    int space = YY.indexOf(" ");

    // grab substring from after parentesis up to comma
    String y = YY.substring(space + 1, YY.length() - 1);

    // return value back to main so it can be used later in the program
    return Integer.parseInt(y);
  } // end getX method

 
  public static void q(int x, int y){
      if (x > 0 && y > 0){
        System.out.println("lies in First quadrant");
      }
        else if (x < 0 && y > 0){
             System.out.println("lies in Second quadrant");
        }
        else if (x < 0 && y < 0){
             System.out.println("lies in Third quadrant");
        }
        else if (x > 0 && y < 0){
             System.out.println("lies in Fourth quadrant");
        }
        else if (x == 0 && y > 0){
            System.out.println("lies at positive y axis");
        }
        else if (x == 0 && y < 0){
            System.out.println("lies at negative y axis");
        }
        else if (y == 0 && x < 0){
            System.out.println("lies at negative x axis");
        }
        else if (y == 0 && x > 0){
            System.out.println("lies at positive x axis");
        }
        else {
            System.out.println("lies at origin");
        }
    }
  
    
  
   public static double eudclideanDistance(int x1,int y1,int x2, int y2){
    double Dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    return Dis;
  }


  public static int taxicabDistance(int x1,int y1,int x2,int y2){
   int b1=x2-x1;
   int b2=y2-y1;
   int b3 =Math.abs(b2)+Math.abs(b1);
   return b3;
  }

} // end class
