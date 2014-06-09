package myRPS;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComputerPlayerTest {


	@Test
	public void testGeneratedChoice() {
		ComputerPlayer myComPlayer = new ComputerPlayer();
		int theChoice=0;
		int Zeroes=0, Ones=0, Twos=0, tooBig=0, tooSmall=0;
		for(int i=0;i<50;i++){
			theChoice=myComPlayer.generateChoice();
			if (theChoice<0) tooSmall++ ;	
			if (theChoice==0) Zeroes++ ;	
			if (theChoice==1) Ones++ ;	
			if (theChoice==2) Twos++ ;	
			if (theChoice>2) tooBig++ ;	
		}
		assertTrue(tooSmall==0);
		assertTrue(Zeroes>0);
		assertTrue(Ones>0);
		assertTrue(Twos>0);
		assertTrue(tooBig==0);
	}

}
