import java.util.Scanner;
public class RNG {
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int c = 6;
        int gnum, guess;
        int max=0;
        System.out.println(
        "What mode do u want to start off with?-->Easy or Medium or Hard: ");
        String mode = s.nextLine();
        if (mode.equals("Easy")){
            max = 10;
            System.out.println(
            "You got 6 attempts to guess the correct number ->" + " Guess the right number from 1 to 20: ");
         }
         else if (mode.equals("medium")){
             max = 15;
             System.out.println(
             "You got "+(c-2)+" attempts to guess the correct number ->" + " Guess the right number from 1 to 20: ");
         }
          else if(mode.equals("Hard")){
              max = 20;
              System.out.println(
              "You got "+(c-4)+" attempts to guess the correct number ->" + " Guess the right number from 1 to 6: ");
        }
        int number = 1 + (int)(max* Math.random());
    System.out.println(number);
        for (gnum = 0; gnum < c; gnum++) {
            System.out.println(
                "Guess the number from 1 to"+(max)+":");
            guess = s.nextInt();
            if (number == guess) {
                System.out.println(
                    "Congratulations!" + " You guessed the number.");
                break;
            }
            else if (number > guess && gnum != c - 1) {
                System.out.println(
                    "The number is " + "greater than " + guess);
                        }
                       else if (number != guess){
                               System.out.println("Your guess is "+(number-guess)+" far away from the right answer.");
      
            }
            else if (number < guess && gnum != c - 1) {
                System.out.println("The number is" + " less than " + guess);
            }
        }
        if (gnum == c) {
            System.out.println("You have wasted" + " your 5 attempts .");

            System.out.println("The number was " + number);
        }
    }
}
