package genericutility;

import java.time.LocalDateTime;
import java.util.Random;

public class JavaUtility {
/**
 * This method is used to capture current system data and time
 * @return 
 * @return String
 */
	public String getSystemTime() {
	return	LocalDateTime.now().toString().replace(":", "-");
	}
	/**
	 * This method is used to generate random numbers within 1000
	 * @return 
	 * @return int
	 */
	public int getRandomNumber() {
		Random ran=new Random();
	return	ran.nextInt(1000);
	}	
}
