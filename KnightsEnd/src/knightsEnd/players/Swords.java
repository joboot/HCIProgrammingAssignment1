package knightsEnd.players;

// TODO: Auto-generated Javadoc
/**
 * The Interface Swords. This interface holds all of the moveResults for the
 * slashAttack and the JabAttack
 */
public interface Swords {

	/**
	 * Jab attack. Uses switch statement to decide the success of the jab
	 *
	 * @param moveSuccess the move success
	 * @return the string
	 */
	public default String jabAttack(int moveSuccess) {

		String moveResults = "Hm... something must be wrong with jab";

		switch (moveSuccess) {
		case 1:
		case 2:
		case 3:
			moveResults = "That was a pretty weak jab...";
			break;
		case 4:
		case 5:
		case 6:
		case 7:
			moveResults = "Hey, that was a decent jab...";
			break;
		case 8:
		case 9:
		case 10:
			moveResults = "Wow, that was a critical jab!!!";
			break;
		default:
			moveResults = "Something is wrong with the jab";
		}
		return moveResults;
	}

	/**
	 * Slash attack. Uses switch statement to decide the success of the slash
	 *
	 * @param moveSuccess the move success
	 * @return the string
	 */
	public default String slashAttack(int moveSuccess) {

		String moveResults = "Hm... something must be wrong with slash";

		switch (moveSuccess) {
		case 1:
		case 2:
		case 3:
			moveResults = "That was a pretty weak slash...";
			break;
		case 4:
		case 5:
		case 6:
		case 7:
			moveResults = "Hey, that was a decent slash...";
			break;
		case 8:
		case 9:
		case 10:
			moveResults = "Wow, that was a critical slash!!!";
			break;
		default:
			moveResults = "Something is wrong with the slash";
		}
		return moveResults;
	}
}
