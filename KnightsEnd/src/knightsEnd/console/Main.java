package knightsEnd.console;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {

	/**
	 * The main method. Surrounded by a try/catch method. Launches all of these
	 * methods in this order: 1) Game.displayGameIntro() 2) Game.playerSetup() 3)
	 * Game.playerIntros() 4) Game.playRounds() 5) Game.announceWinner() 6)
	 * Game.displayGameClosing()
	 * 
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		try {

			Game.displayGameIntro();
			Game.playerSetup();
			Game.playerIntros();
			Game.playRounds();
			Game.announceWinner();
			Game.displayGameClosing();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println("The program has ended with an error");
		}

	}
}
