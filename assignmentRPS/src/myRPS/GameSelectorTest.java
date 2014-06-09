/**
 * 
 */
package myRPS;


//import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author Lars
 *
 */
public class GameSelectorTest {

	/**
	 * @throws java.lang.Exception
	 */

	/*
	 * This doesn't check any return values from methods.
	 * It displays succinctly the console printouts from the different ways of playing,
	 * except the "play again?" printouts. 
	 * It doesn't show all the different possible outcomes caused by the computer's 
	 * random choices, but that is checked in RockPaperScissorsTest.
	 */
	@Test
	public void testComputersRandomChoice() {
		String[] playerInput={"0","0"};
		playerInput[0]="0";
		GameSelector.main(playerInput) ;
		playerInput[0]="1";playerInput[1]="0";
		GameSelector.main(playerInput) ;
		playerInput[0]="1";playerInput[1]="1";
		GameSelector.main(playerInput) ;
		playerInput[0]="1";playerInput[1]="2";
		GameSelector.main(playerInput) ;
		playerInput[0]="1";playerInput[1]="3";
		GameSelector.main(playerInput) ;
		playerInput[0]="2";
		GameSelector.main(playerInput) ;
		playerInput[0]="3";
		GameSelector.main(playerInput) ;
		playerInput[0]="-1";
		GameSelector.main(playerInput) ;
	}

}
