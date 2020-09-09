package bounds;

import java.util.Scanner;

/*
 * Programmer: Russell Taylor  Date: 5/20/2020
 * Outputs a sequence of numbers based on a starting number,
 * upper bound, and step size, which are input by the user
 */

public class Bounds {

	public static void main(String[] args) {
		int start, upper, step;
		Scanner in = new Scanner(System.in);
		
		// prompt the user for starting number, upper bound, and step size
		System.out.print("Enter starting number: ");
		start = in.nextInt();
		System.out.print("Enter upper bound: ");
		upper = in.nextInt();
		System.out.print("Enter step size: ");
		step = in.nextInt();
		
		// display the three numbers input by the user
		System.out.println("\nThe starting number you entered is " + start);
		System.out.println("The upper bound you entered is " + upper);
		System.out.println("The step size you entered is " + step);
		System.out.println();
		
		// display the sequence of numbers
		int number = start, count = 0;
		while (number < upper) {
			System.out.print(number + " ");
			number = number + step;
			
			// start a new line after every ten numbers
			count++;
			if (count % 10 == 0)
				System.out.println();
		}

		in.close();
	}

}
