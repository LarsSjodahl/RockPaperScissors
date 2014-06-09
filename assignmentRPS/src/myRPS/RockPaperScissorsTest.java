package myRPS;

import static org.junit.Assert.*;

import org.junit.Test;

public class RockPaperScissorsTest {



	/**
	 * Play 50 times each with all the different possible inputs in int format.
	 * Verify that no results are out of bounds
	 * and that each result happens at least once,
	 * so I haven't messed up the scaling, offset and rounding-to-int of the random number.
	 * It would be extremely unlikely that any correct result wouldn't happen at least once.
	 */
	@Test
	public void testPlayPvC() {
		RockPaperScissors myRPSgame = new RockPaperScissors(); 
		int battleResult=0;
		
		// test for 0 as argument
		int Zeroes=0, Ones=0, Twos=0, tooBig=0, tooSmall=0; 
		for(int i=0;i<50;i++){
			battleResult=myRPSgame.playPvC(0);
			if (battleResult<0) tooSmall++ ;	
			if (battleResult==0) Zeroes++ ;	
			if (battleResult==1) Ones++ ;	
			if (battleResult==2) Twos++ ;	
			if (battleResult>2) tooBig++ ;	
		}
		assertTrue(tooSmall==0);
		assertTrue(Zeroes>0);
		assertTrue(Ones>0);
		assertTrue(Twos>0);
		assertTrue(tooBig==0);
		
		// test for 1 as argument
		Zeroes=0;
		Ones=0; 
		Twos=0;
		tooBig=0;
		tooSmall=0; 
		for(int i=0;i<50;i++){
			battleResult=myRPSgame.playPvC(1);
			if (battleResult<0) tooSmall++ ;	
			if (battleResult==0) Zeroes++ ;	
			if (battleResult==1) Ones++ ;	
			if (battleResult==2) Twos++ ;	
			if (battleResult>2) tooBig++ ;	
		}
		assertTrue(tooSmall==0);
		assertTrue(Zeroes>0);
		assertTrue(Ones>0);
		assertTrue(Twos>0);
		assertTrue(tooBig==0);
		
		// test for 2 as argument
		Zeroes=0;
		Ones=0; 
		Twos=0;
		tooBig=0;
		tooSmall=0; 
		for(int i=0;i<50;i++){
			battleResult=myRPSgame.playPvC(2);
			if (battleResult<0) tooSmall++ ;	
			if (battleResult==0) Zeroes++ ;	
			if (battleResult==1) Ones++ ;	
			if (battleResult==2) Twos++ ;	
			if (battleResult>2) tooBig++ ;	
		}
		assertTrue(tooSmall==0);
		assertTrue(Zeroes>0);
		assertTrue(Ones>0);
		assertTrue(Twos>0);
		assertTrue(tooBig==0);

		// Test a few invalid arguments
		assertTrue(myRPSgame.playPvC(3)==-1);
		assertTrue(myRPSgame.playPvC(-1)==-1);
		assertTrue(myRPSgame.playPvC(3456345)==-1);
}

	/**
	 * Play 50 times each with all the different possible inputs in String format.
	 * Verify that no results are out of bounds
	 * and that each result happens at least once,
	 * so I haven't messed up the scaling, offset and rounding-to-int of the random number.
	 * It would be extremely unlikely that any correct result wouldn't happen at least once.
	 */
	@Test
	public void testPlayPvC_strInput() {
		RockPaperScissors myRPSgame = new RockPaperScissors(); 
		int battleResult=0;
		// test for "0" as argument
		int Zeroes=0, Ones=0, Twos=0, tooBig=0, tooSmall=0;
		for(int i=0;i<50;i++){
			battleResult=myRPSgame.playPvC("0");
			if (battleResult<0) tooSmall++ ;	
			if (battleResult==0) Zeroes++ ;	
			if (battleResult==1) Ones++ ;	
			if (battleResult==2) Twos++ ;	
			if (battleResult>2) tooBig++ ;	
		}
		assertTrue(tooSmall==0);
		assertTrue(Zeroes>0);
		assertTrue(Ones>0);
		assertTrue(Twos>0);
		assertTrue(tooBig==0);
		
		// test for "1" as argument
		Zeroes=0;
		Ones=0; 
		Twos=0;
		tooBig=0;
		tooSmall=0; 
		for(int i=0;i<50;i++){
			battleResult=myRPSgame.playPvC("1");
			if (battleResult<0) tooSmall++ ;	
			if (battleResult==0) Zeroes++ ;	
			if (battleResult==1) Ones++ ;	
			if (battleResult==2) Twos++ ;	
			if (battleResult>2) tooBig++ ;	
		}
		assertTrue(tooSmall==0);
		assertTrue(Zeroes>0);
		assertTrue(Ones>0);
		assertTrue(Twos>0);
		assertTrue(tooBig==0);
		
		// test for "2" as argument
		Zeroes=0;
		Ones=0; 
		Twos=0;
		tooBig=0;
		tooSmall=0; 
		for(int i=0;i<50;i++){
			battleResult=myRPSgame.playPvC("2");
			if (battleResult<0) tooSmall++ ;	
			if (battleResult==0) Zeroes++ ;	
			if (battleResult==1) Ones++ ;	
			if (battleResult==2) Twos++ ;	
			if (battleResult>2) tooBig++ ;	
		}
		assertTrue(tooSmall==0);
		assertTrue(Zeroes>0);
		assertTrue(Ones>0);
		assertTrue(Twos>0);
		assertTrue(tooBig==0);
		
		// test for a few invalid arguments
		assertTrue(myRPSgame.playPvC("3")==-1);
		assertTrue(myRPSgame.playPvC("-1")==-1);
		assertTrue(myRPSgame.playPvC("a")==-1);
	}

	/**
	 * Play 50 times which results in outcomes that are expected to be
	 * randomized but restricted to the interval 0, 1 or 2.
	 * Verify that no results are out of bounds
	 * and that each result happens at least once, so I haven't messed up 
	 * the scaling, offset and rounding-to-int of the random number.
	 * It is extremely unlikely that any one of the correct result 
	 * wouldn't happen at least once in 50 played games.
	 */
	@Test
	public void testPlayCvC() {
		//fail("Not yet implemented");
		RockPaperScissors myRPSgame = new RockPaperScissors(); 
		assertTrue(myRPSgame.playCvC() <=2);
		
		int battleResult=0;
		int Zeroes=0, Ones=0, Twos=0, tooBig=0, tooSmall=0;
		for(int i=0;i<50;i++){
			battleResult=myRPSgame.playCvC();
			if (battleResult<0) tooSmall++ ;	
			if (battleResult==0) Zeroes++ ;	
			if (battleResult==1) Ones++ ;	
			if (battleResult==2) Twos++ ;	
			if (battleResult>2) tooBig++ ;	
		}
		assertTrue(tooSmall==0);
		assertTrue(Zeroes>0);
		assertTrue(Ones>0);
		assertTrue(Twos>0);
		assertTrue(tooBig==0);
	}

	/**
	 * Test the algorithm for deciding the winner. 
	 * Verify all valid combinations of inputs.
	 * Also test a sample of invalid inputs and validate they all fail.
	 */
	@Test
	public void testWinnerIs() {
		//fail("Not yet implemented");
		RockPaperScissors myRPSgame = new RockPaperScissors(); 
		assertEquals("It should be a tie.", 0, myRPSgame.playRPS(0,0,"Testplayer1","Testplayer2"));
		assertEquals("It should be a tie.", 0, myRPSgame.playRPS(1,1,"Testplayer1","Testplayer2"));
		assertEquals("It should be a tie.", 0, myRPSgame.playRPS(2,2,"Testplayer1","Testplayer2"));
		assertEquals("TestPlayer1 should win.", 1, myRPSgame.playRPS(1,0,"Testplayer1","Testplayer2"));
		assertEquals("TestPlayer1 should win.", 1, myRPSgame.playRPS(2,1,"Testplayer1","Testplayer2"));
		assertEquals("TestPlayer1 should win.", 1, myRPSgame.playRPS(0,2,"Testplayer1","Testplayer2"));
		assertEquals("TestPlayer2 should win.", 2, myRPSgame.playRPS(0,1,"Testplayer1","Testplayer2"));
		assertEquals("TestPlayer2 should win.", 2, myRPSgame.playRPS(1,2,"Testplayer1","Testplayer2"));
		assertEquals("TestPlayer2 should win.", 2, myRPSgame.playRPS(2,0,"Testplayer1","Testplayer2"));
		assertEquals("The inputs are invalid.", -1, myRPSgame.playRPS(-1,0,"Testplayer1","Testplayer2"));
		assertEquals("The inputs are invalid.", -1, myRPSgame.playRPS(2,-1,"Testplayer1","Testplayer2"));
	}

}
