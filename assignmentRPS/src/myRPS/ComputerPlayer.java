package myRPS;


public class ComputerPlayer {

	public int generateChoice() {
		int res = (int)(Math.random()*3) ;
		return res;
	}

}
