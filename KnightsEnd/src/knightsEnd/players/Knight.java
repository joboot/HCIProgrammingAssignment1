package knightsEnd.players;

// TODO: Auto-generated Javadoc
/**
 * The Class Knight. This class implements interfaces Swords and Blunt. This
 * class also holds all of the information on a Knight.
 * 
 */
public class Knight implements Swords, Blunt {

	/** The role. */
	public final String role = "Knight";

	/** The name. */
	protected String name;

	/** The weapon. */
	protected String weapon;

	/** The alignment. */
	protected String alignment;

	/** The signature move. */
	protected String signatureMove;

	/** The finisher move. */
	protected String finisherMove;

	/** The player quote. */
	protected String playerQuote;

	/** The point total. */
	protected int pointTotal;

	/**
	 * Instantiates a new knight.
	 */
	public Knight() {
		this.name = "Unknown";
		this.weapon = "Unknown";
		this.alignment = "Unknown";
		this.playerQuote = "Unknown";
		this.pointTotal = 0;
	}

	/**
	 * Instantiates a new knight. Overloaded constructor that adds in specific
	 * information
	 *
	 * @param name        the name
	 * @param weapon      the weapon
	 * @param alignment   the alignment
	 * @param playerQuote the player quote
	 * @param pointTotal  the point total
	 */
	public Knight(String name, String weapon, String alignment, String playerQuote, int pointTotal) {
		this();
		this.name = name;
		this.weapon = weapon;
		this.alignment = alignment;
		this.playerQuote = playerQuote;
		this.pointTotal = 0;
	}

	/**
	 * Adds the point total.
	 *
	 * @param pointTotal the point total
	 */
	public void addPointTotal(int pointTotal) {
		this.pointTotal += pointTotal;
	}

	/**
	 * Finisher move. Uses switch statement to decide the success of the finisher
	 * move
	 *
	 * @param moveSuccess the move success
	 * @return the string
	 */
	public String finisherMove(int moveSuccess) {

		String moveResults = "Unknown";

		switch (moveSuccess) {
		case 1:
		case 2:
		case 3:
			moveResults = "That was a pretty weak finisher move...";
			break;
		case 4:
		case 5:
		case 6:
		case 7:
			moveResults = "Hey, that was a decent finisher move...";
			break;
		case 8:
		case 9:
		case 10:
			moveResults = "Wow, that finisher move delivered a critical hit!!!";
			break;
		default:
			moveResults = "Something is wrong with the finisher move";
		}

		return moveResults;
	}

	/**
	 * Gets the alignment.
	 *
	 * @return the alignment
	 */
	public String getAlignment() {
		return alignment;
	}

	/**
	 * Gets the finisher move.
	 *
	 * @return the finisher move
	 */
	public String getFinisherMove() {
		return finisherMove;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the player quote.
	 *
	 * @return the player quote
	 */
	public String getPlayerQuote() {
		return playerQuote;
	}

	/**
	 * Gets the point total.
	 *
	 * @return the point total
	 */
	public int getPointTotal() {
		return pointTotal;
	}

	/**
	 * Gets the signature move.
	 *
	 * @return the signature move
	 */
	public String getSignatureMove() {
		return signatureMove;
	}

	/**
	 * Gets the weapon.
	 *
	 * @return the weapon
	 */
	public String getWeapon() {
		return weapon;
	}

	/**
	 * Sets the alignment.
	 *
	 * @param alignment the new alignment
	 */
	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}

	/**
	 * Sets the finisher move.
	 *
	 * @param finisherMove the new finisher move
	 */
	public void setFinisherMove(String finisherMove) {
		this.finisherMove = finisherMove;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Sets the player quote.
	 *
	 * @param playerQuote the new player quote
	 */
	public void setPlayerQuote(String playerQuote) {
		this.playerQuote = playerQuote;
	}

	/**
	 * Sets the signature move.
	 *
	 * @param signatureMove the new signature move
	 */
	public void setSignatureMove(String signatureMove) {
		this.signatureMove = signatureMove;
	}

	/**
	 * Sets the weapon.
	 *
	 * @param weapon the new weapon
	 */
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	/**
	 * Signature move. Uses switch statement to decide the success of the signature
	 * move
	 * 
	 * @param moveSuccess the move success
	 * @return the string
	 */
	public String signatureMove(int moveSuccess) {

		String moveResults = "Unknown";

		switch (moveSuccess) {
		case 1:
		case 2:
		case 3:
			moveResults = "That was a pretty weak hit...";
			break;
		case 4:
		case 5:
		case 6:
		case 7:
			moveResults = "Hey, that was a decent hit...";
			break;
		case 8:
		case 9:
		case 10:
			moveResults = "Wow, that was a critical hit!!!";
			break;
		default:
			moveResults = "Something is wrong with the signature move";
		}

		return moveResults;
	}

}// end of knight class
