package knightsEnd.players;

// TODO: Auto-generated Javadoc
/**
 * The Interface Blunt. This interface holds all of the moveResults for the
 * kickAttack and the shieldBashAttack
 */
public interface Blunt {

	/**
	 * Kick attack. Uses switch statement to decide the success of the kick
	 *
	 * @param moveSuccess the move success
	 * @return the string
	 */
	public default String kickAttack(int moveSuccess) {

		String moveResults = "Hm... something must be wrong with kick";

		switch (moveSuccess) {
		case 1:
		case 2:
		case 3:
			moveResults = "That was a pretty weak kick...";
			break;
		case 4:
		case 5:
		case 6:
		case 7:
			moveResults = "Hey, that was a decent kick...";
			break;
		case 8:
		case 9:
		case 10:
			moveResults = "Wow, that was a critical kick!!!";
			break;
		default:
			moveResults = "Something is wrong with the kick";
		}
		return moveResults;
	}

	/**
	 * Shield bash attack. Uses switch statement to decide the success of the shield
	 * bash
	 *
	 * @param moveSuccess the move success
	 * @return the string
	 */
	public default String shieldBashAttack(int moveSuccess) {

		String moveResults = "Hm... something must be wrong with shield bash";

		switch (moveSuccess) {
		case 1:
		case 2:
		case 3:
			moveResults = "That was a pretty weak shield bash...";
			break;
		case 4:
		case 5:
		case 6:
		case 7:
			moveResults = "Hey, that was a decent shield bash...";
			break;
		case 8:
		case 9:
		case 10:
			moveResults = "Wow, that was a critical shield bash!!!";
			break;
		default:
			moveResults = "Something is wrong with the shield bash";
		}
		return moveResults;
	}

}
