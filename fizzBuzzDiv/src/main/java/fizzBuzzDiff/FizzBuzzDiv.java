package fizzBuzzDiff;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class FizzBuzzDiv {
	private int numberToCheck;
	private static final int THREE = 3;
	private static final int FIVE = 5;

	public FizzBuzzDiv(int numberToCheck) {

		this.numberToCheck = numberToCheck;

	}

	public static void main(String[] args) {
		try{
		String number = JOptionPane.showInputDialog(null,
				"Which number shall be checked? \nThe results will be Fizz, if number is divisible by 3, Buzz - by 5, \nFizzBuzz - by both \nand will show nothing if it's not divisible by either.\n");

		FizzBuzzDiv numToCheck = new FizzBuzzDiv(Integer.parseInt(number));

		JFrame frame = new JFrame("JOptionPane showMessageDialog example");
		JOptionPane.showMessageDialog(frame, numToCheck.printAccordingToDivisibility(THREE, FIVE), "Results:",
				JOptionPane.INFORMATION_MESSAGE);
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Wrong input, cannot show any result.", "Error", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
	}

	public boolean isDivisible(int divsor) {

		return (numberToCheck % divsor == 0) ? true : false;
	}

	public String printAccordingToDivisibility(int firstDiv, int secondDiv) {

		if (isDivisible(firstDiv)) {
			return isDivisible(secondDiv) ? "FizzBuzz" : "Fizz";
		}

		return isDivisible(secondDiv) ? "Buzz" : "";
	}
}
