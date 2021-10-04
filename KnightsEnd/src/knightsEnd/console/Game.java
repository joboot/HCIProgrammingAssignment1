package knightsEnd.console;

import java.util.Random;
import knightsEnd.players.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Game. This class holds all of the needed methods to play the game
 */
public class Game {

	/** The Constant DEBUG_ON. */
	// set this field to true if you want to know when a method starts and end for
	// debugging purposes
	public static final boolean DEBUG_ON = false;

	/** The player 1. */
	protected static Knight player1;

	/** The player 2. */
	protected static Knight player2;

	/** The num heats. */
	protected static int numHeats;

	/** The Constant moves. */
	final static String[] moves = { "Slash Attack", "Jab Attack", "Kick Attack", "Shield Bash Attack" };

	/** The Constant roles. */
	final static String[] roles = { "White Knight", "Black Knight" };

	/**
	 * Announce winner.
	 */
	protected static void announceWinner() {

		if (DEBUG_ON)
			System.out
					.println("\tDEBUG START: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " START.");

		int playerNumber;
		Knight winner;

		if (player1.getPointTotal() > player2.getPointTotal()) {
			playerNumber = 1;
			winner = player1;
		} else {
			playerNumber = 2;
			winner = player2;
		}

		Console.poundLineGap();

		System.out.println(winner.getName() + " finishes off the game with " + winner.getFinisherMove() + "!");
		System.out.println("Player " + playerNumber + " " + winner.getName() + " has won in the name of the King!");
		System.out.println("----- " + winner.getPlayerQuote() + " -----");

		Console.poundLineGap();

		if (DEBUG_ON)
			System.out.println("\tDEBUG END: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " END.");

	}

	/**
	 * Creates the player. Uses a switch statement to create a player based on what
	 * the player inputs
	 *
	 * @param role the role
	 * @return the knight
	 */
	protected static Knight createPlayer(int role) {
		// System.out.println("Need to code the createPlayer");

		if (DEBUG_ON)
			System.out
					.println("\tDEBUG START: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " START.");

		Knight player = null;

		switch (role) {
		case 1:
			player = new WhiteKnight();
			break;
		case 2:
			player = new BlackKnight();
			break;
		default:
			System.out.println("Something went wrong with createPlayer...");

		}
		if (DEBUG_ON)
			System.out.println("\tDEBUG END: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " END.");

		return player;
	}

	/**
	 * Displays game closing.
	 */
	protected static void displayGameClosing() {

		if (DEBUG_ON)
			System.out
					.println("\tDEBUG START: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " START.");

		System.out.println("Thank you for playing Knight's End! Come back sometime and play again!");

		if (DEBUG_ON)
			System.out.println("\tDEBUG END: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " END.");

	}

	/**
	 * Displays game intro and rules.
	 * 
	 */
	protected static void displayGameIntro() {

		if (DEBUG_ON)
			System.out
					.println("\tDEBUG START: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " START.");

		Console.doubleDashLineGap();

		System.out.println("Welcome to...");
		System.out.println(" _____     _     _   _          _____       _ ");
		System.out.println("|  |  |___|_|___| |_| |_ ___   |   __|___ _| |");
		System.out.println("|    -|   | | . |   |  _|_ -|  |   __|   | . |");
		System.out.println("|__|__|_|_|_|_  |_|_|_| |___|  |_____|_|_|___|");
		System.out.println("            |___|   ");

		Console.doubleDashLineGap();

		System.out.println("1) This is a two player game.\r\n" + "2) Each player selects a specific knight.\r\n"
				+ "3) At the start of each round, each player will select an attack\r\n"
				+ "4) Based on each player's random number (between 1 and 10)\r\n"
				+ "   will determine which player wins the round or ends in a draw.\r\n"
				+ "5) The player who gets 25 points first wins.\r\n"
				+ "6) A player has the option to forfeit after each round which will end the game.\r\n\n"
				+ "...May the best knight win...");

		Console.doubleDashLineGap();
		Console.pressEnterToContinue();

		if (DEBUG_ON)
			System.out.println("\tDEBUG END: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " END.");

	}

	/**
	 * Displays moves. Cycles through moves with a for loop
	 *
	 * @param player the player
	 */
	protected static void displayMoves(Knight player) {

		if (DEBUG_ON)
			System.out
					.println("\tDEBUG START: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " START.");

		Console.doubleDashLineGap();

		for (int i = 0; i < moves.length; i++) {
			System.out.println("#" + (i + 1) + " " + moves[i] + " ");
		}

		System.out.println("#5 " + player.getSignatureMove());
		System.out.println("#6 " + player.getFinisherMove());

		Console.doubleDashLineGap();

		if (DEBUG_ON)
			System.out.println("\tDEBUG END: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " END.");

	}

	/**
	 * Displays player info.
	 *
	 * @param player the player
	 */
	protected static void displayPlayerInfo(Knight player) {

		if (DEBUG_ON)
			System.out
					.println("\tDEBUG START: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " START.");

		Console.singleDashLineGap();

		System.out.println("Name: " + player.getName());
		System.out.println("Weapon: " + player.getWeapon());
		System.out.println("Alignment: " + player.getAlignment());
		System.out.println("Signature Move: " + player.getSignatureMove());
		System.out.println("Finisher Move: " + player.getFinisherMove());
		System.out.println("Quote: " + player.getPlayerQuote());

		Console.singleDashLineGap();

		if (DEBUG_ON)
			System.out.println("\tDEBUG END: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " END.");
	}

	/**
	 * Displays roles. Cycles through roles array with a for loop
	 * 
	 */
	protected static void displayRoles() {

		if (DEBUG_ON)
			System.out
					.println("\tDEBUG START: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " START.");

		System.out.println(Console.doubleDashLine);

		for (int i = 0; i < roles.length; i++) {
			System.out.println("#" + (i + 1) + " " + roles[i] + " ");
		}

		System.out.println(Console.doubleDashLine);

		if (DEBUG_ON)
			System.out.println("\tDEBUG END: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " END.");
	}

	/**
	 * Perform move. Uses a switch statement that retrieves the moveResults from
	 * each of the moves based on what the player selects. MoveSuccess is randomized
	 * from numbers 1-10
	 *
	 * @param player     the player
	 * @param playerMove the player move
	 * @return the int
	 */
	protected static int performMove(Knight player, int playerMove) {

		if (DEBUG_ON)
			System.out
					.println("\tDEBUG START: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " START.");

		Random randGen = new Random();

		int moveSuccess = randGen.nextInt(10) + 1;

		String moveResults = null;

		switch (playerMove) {
		case 1:
			moveResults = player.slashAttack(moveSuccess);
			break;
		case 2:
			moveResults = player.jabAttack(moveSuccess);
			break;
		case 3:
			moveResults = player.kickAttack(moveSuccess);
			break;
		case 4:
			moveResults = player.shieldBashAttack(moveSuccess);
			break;
		case 5:
			moveResults = player.signatureMove(moveSuccess);
			break;
		case 6:
			moveResults = player.finisherMove(moveSuccess);
			break;
		}

		System.out.println(player.getName() + ", " + moveResults);

		if (DEBUG_ON)
			System.out.println("\tDEBUG END: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " END.");

		return moveSuccess;
	}

	/**
	 * Player intros.
	 */
	protected static void playerIntros() {

		if (DEBUG_ON)
			System.out
					.println("\tDEBUG START: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " START.");

		Console.poundLineGap();

		System.out.println(player1.getName() + " has entered the arena.");
		System.out.println("----- " + player1.getPlayerQuote() + " -----");

		Console.singleDashLineGap();

		System.out.println(player2.getName() + " has entered the arena.");
		System.out.println("----- " + player2.getPlayerQuote() + " -----");

		System.out.println();
		Console.pressEnterToContinue();

		if (DEBUG_ON)
			System.out.println("\tDEBUG END: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " END.");

	}

	/**
	 * Player setup. Asks the players to choose their knight and ensures that they
	 * choose different ones
	 */
	protected static void playerSetup() {
		// System.out.println("Need to code the playerSetup");
		if (DEBUG_ON)
			System.out
					.println("\tDEBUG START: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " START.");

		int role;

		while (true) {
			System.out.println("Player 1 please select your Knight.");
			Game.displayRoles();
			System.out.print("Which Knight will you choose, sire? ");
			role = Console.numericInput(1, roles.length);
			player1 = Game.createPlayer(role);
			Game.displayPlayerInfo(player1);
			Console.pressEnterToContinue();

			System.out.println("Player 2 please select your Knight.");
			Game.displayRoles();
			System.out.print("Which Knight will you choose, sire? ");
			role = Console.numericInput(1, roles.length);
			player2 = Game.createPlayer(role);
			Game.displayPlayerInfo(player2);
			Console.pressEnterToContinue();

			if (player1.getName().equals(player2.getName())) {
				System.out.println("Please choose different characters.\n");
			} else {
				break;
			}

		}

		if (DEBUG_ON)
			System.out.println("\tDEBUG END: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " END.");

	}

	/**
	 * Play rounds. Players select what moves they want to use and based on the
	 * moveSuccess, they earn points which is the scoring system of the game. When a
	 * player gets to 25 points, they win. Otherwise they can decide to exit the
	 * game after every round.
	 */
	protected static void playRounds() {

		if (DEBUG_ON)
			System.out
					.println("\tDEBUG START: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " START.");

		int points = 0;
		int player1Move = 0;
		int player2Move = 0;
		int player1MoveSuccess = 0;
		int player2MoveSuccess = 0;

		do {
			Game.displayMoves(player1);
			System.out.println(player1.getName() + " please select your move, sire:");
			player1Move = Console.numericInput(1, moves.length + 2);

			System.out.println();

			Game.displayMoves(player2);
			System.out.println(player2.getName() + " please select your move, sire:");
			player2Move = Console.numericInput(1, moves.length + 2);

			System.out.println();

			player1MoveSuccess = performMove(player1, player1Move);
			player2MoveSuccess = performMove(player2, player2Move);

			System.out.println();

			if (player1MoveSuccess == player2MoveSuccess) {
				System.out.println("It's a draw!");
			} else if (player1MoveSuccess > player2MoveSuccess) {
				points = player1MoveSuccess - player2MoveSuccess;
				player1.addPointTotal(points);
				System.out.println("Player 1 " + player1.getName() + " has won and gained " + points + " points");
			} else if (player1MoveSuccess < player2MoveSuccess) {
				points = player2MoveSuccess - player1MoveSuccess;
				player2.addPointTotal(points);
				System.out.println("Player 2 " + player2.getName() + " has won and gained " + points + " points");
			}

			System.out.println("Player 1 points: " + player1.getPointTotal());
			System.out.println("Player 2 points: " + player2.getPointTotal());

			if (player1.getPointTotal() >= 25 || player2.getPointTotal() >= 25) {
				break;
			}

			Console.doubleDashLineGap();

		} while (Console.ynInputValue("Do you want to continue fighting for your honor?"));

		if (DEBUG_ON)
			System.out.println("\tDEBUG END: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " END.");

	}

}// end of game
