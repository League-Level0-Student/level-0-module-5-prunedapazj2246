package _04_guessing_pi;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GuessingPi {
	public static void main(String[] args) {// 1. Make a main method and make sure your program can run

	String pi = "3141592653";	// 2. Make a String variable to hold the value of Pi.
		// Get the first few digits from http://www.piday.org/million/.


			System.out.println(pi.charAt(0));// 3. Print out the first 3 digits of Pi to the console.
	System.out.println(pi.charAt(1));// The first value is "pi.charAt(0)", the second is "pi.charAt(1)", etc.
	System.out.println(pi.charAt(2));// Run your program to see how this works.

		// 9. If you want to give the user more than one chance to guess,
		// put a for loop around steps 4-8.

		// 4. Create a for loop that will step through each digit of pi (steps 5-8)
		// NOTE: The number of digits in your string will be
		for (int i = 3; i < pi.length(); i++) {
			
		// yourStringVariable.length()

	String guess = JOptionPane.showInputDialog(null, "What is the next digit of pi?");
	int t = Integer.parseInt(guess);
	// 5. Ask the user for the NEXT digit of pi.
	if(guess.equals( pi.charAt(i)+"")) {	// 6. Compare the user's input to the next digit of your pi variable
		JOptionPane.showMessageDialog(null, "CORRECT!");// (look at step 3 for a clue).
	}// HINT: use charAt(0) to get 1st char of user input String
	else {
		JOptionPane.showMessageDialog(null, "Incorrect");
		break;
	}
		// 7. If they are correct, print out "correct".

		}	// 8. If they are not, print out "incorrect" and tell them
		// to start over. Use 'break;' to break out of the loop.

	}

}
