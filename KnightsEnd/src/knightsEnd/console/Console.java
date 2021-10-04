package knightsEnd.console;

import java.util.Collections;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Console. This holds all of the UI methods such as the line gaps and
 * input
 */
public class Console {

	/** The Scanner. */
	protected static Scanner sc = new Scanner(System.in);

	/** The single dash line. */
	protected static String singleDashLine = String.join("", Collections.nCopies(80, "-"));

	/** The double dash line. */
	protected static String doubleDashLine = String.join("", Collections.nCopies(80, "="));

	/** The pound line. */
	protected static String poundLine = String.join("", Collections.nCopies(80, "#"));

	/**
	 * Double dash line gap.
	 */
	protected static void doubleDashLineGap() {
		System.out.println("\n" + doubleDashLine + "\n");
	}

	/**
	 * Numeric input. Sets a range for numeric input and checks if it is numeric.
	 * 
	 * @param fromNum the from num
	 * @param toNum   the to num
	 * @return the int
	 */
	public static int numericInput(int fromNum, int toNum) {
		int intInputValue = 0;

		while (true) {
			String input = sc.nextLine();

			try {
				intInputValue = Integer.parseInt(input);

				if (intInputValue < fromNum)
					System.out.println("Input is too low, try again");
				else if (intInputValue > toNum)
					System.out.println("Input is too high, try again");
				else
					break;

			} catch (NumberFormatException ne) {
				System.out.println("Input is not a number, try again");
			}
		}
		return intInputValue;
	}

	/**
	 * Pound line gap.
	 */
	protected static void poundLineGap() {
		System.out.println("\n" + poundLine + "\n");
	}

	/**
	 * Press enter to continue.
	 */
	public static void pressEnterToContinue() {
		System.out.println("Press ENTER to continue...");
		Console.sc.nextLine();
	}

	/**
	 * Single dash line gap.
	 */
	protected static void singleDashLineGap() {
		System.out.println("\n" + singleDashLine + "\n");
	}

	/**
	 * Yes/No input value. Checks for y/n input
	 * 
	 * @param msg the msg
	 * @return true, if successful
	 */
	public static boolean ynInputValue(String msg) {

		char cont = 'n';

		while (true) {
			System.out.print(msg + " (y/n): ");
			cont = sc.nextLine().charAt(0);

			Character.toLowerCase(cont);

			if (cont == 'y')
				return true;
			else if (cont == 'n')
				return false;
			else
				System.out.println("Invalid input.");
		}
	}

} // end of console class
