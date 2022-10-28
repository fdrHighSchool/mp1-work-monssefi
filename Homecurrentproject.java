import java.util.Scanner;

public class CoordinatePlane {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String point1, point2;
    boolean isValid;
    do {
      System.out.print("Please enter a point in the form (x, y): ");
 
      point1 = s.nextLine();

      isValid = checkInput(point1);
      if (isValid != true) {
        System.out.println("Incorrect form try again!");
      }
    } while (isValid != true);

    do {
      System.out.print("Please enter a second point: ");
  
      point2 = s.nextLine();

      isValid = checkInput(point2);
      if (isValid != true) {
        System.out.println("Incorrect form try again!");
      }
    } while (isValid != true);

    // test your methods below:
    int x1 = getX(point1);
    int x2 = getX(point2);
    System.out.println("The x values are "+x1 + " and " + x2);
    int y1 = getY(point1);
    int y2 = getY(point2);
    System.out.println("The y values are "+y1 + " and " + y2);

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

 
  public static String q(int graph){
      String quardrant="";
          if (x  > 0 && y > 0)
            quardrant +="lies in First quadrant";
            
          else if (x < 0 && y > 0)
            quardrant +="lies in Second quadrant";
     
          else if (x < 0 && y < 0)
            quardrant +="lies in Third quadrant";
     
          else if (x > 0 && y < 0)
            quardrant +="lies in Fourth quadrant";
     
          else if (x == 0 && y > 0)
            quardrant +="lies at positive y axis";
     
        else if (x == 0 && y < 0)
            quardrant +="lies at negative y axis";
     
        else if (y == 0 && x < 0)
            quardrant +="lies at negative x axis";
     
        else if (y == 0 && x > 0)
            quardrant +="lies at positive x axis";
     
        else
            quardrant +="lies at origin";
        return quardrant;
   }
  
  /*
   * N: euclideanDistance
   * P: calculate the distance between two points
        sqrt((x2 - x1)^2 + (y2 - y1)^2)
   * I:
   * R:
   */


  /*
   * N: taxicabDistance
   * P: calculate the distance between two points
        abs(x2 - x1) + abs(y2 - y1)
   * I:
   * R:
   */


} // end class
