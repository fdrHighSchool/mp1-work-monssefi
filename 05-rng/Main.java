import java.util.Scanner;

public class Main {
	public static void RNG()
	{
		Scanner s = new Scanner(System.in);
		int number = 1 + (int)(20* Math.random());
		int c = 5;
		int gnum, guess;
		System.out.println(
			"You got 5 attempts to guess the correct number ->" + " Guess the right number from 1 to 6: ");
    System.out.println(number);
		for (gnum = 0; gnum < c; gnum++) {
			System.out.println(
				"Guess the number:");
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
	public static void
	main(String arg[])
	{
		RNG();
	}
}
