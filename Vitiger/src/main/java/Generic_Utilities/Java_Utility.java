package Generic_Utilities;

import java.util.Random;

/**
 * @author Shweta
 *
 */
public class Java_Utility {

	public int getRandomNumber() {
		Random ranNum = new Random();
		int ranNumber = ranNum.nextInt(1000);
		return ranNumber;
	}
}
