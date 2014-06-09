package myRPS;
import java.util.Scanner;

public class RockPaperScissors {
	String weaponNameFromIndex[]={"rock","paper","scissors"};
	String weaponNameFromIndexCapitalized[]={"Rock","Paper","Scissors"};
	String winningMove[]={"crushes","envelops","cuts"};
	final int ROCK=0;
	final int PAPER=1;
	final int SCISSORS=2;
	
	Scanner in = new Scanner(System.in);
	
	/*
	 * playRPS , Play Rock-Paper-Scissors, takes two players' choices,
	 * 0, 1 or 2 , correlating to "rock", "paper" or "scissors",
	 * uses winnerIs to check if it's a tie or who wins. It then
	 * prints a short text explaining the RPS-rule which decided the winner.
	 * If any player's choice was invalid, playRPS just returns -1.    
	 */
	public int playRPS(int PlayerOneChoice, int PlayerTwoChoice, String playerNameOne, String playerNameTwo) {
		int res=winnerIs(PlayerOneChoice,PlayerTwoChoice); // also validates the inputs, invalid gives -1
		if (res==0) 
			System.out.println("It's a tie!");
		else if(res==1) {
			System.out.println(weaponNameFromIndexCapitalized[PlayerOneChoice]+" "+ winningMove[PlayerOneChoice]+" "+  weaponNameFromIndex[PlayerTwoChoice]+".");
			if(playerNameOne.equals("You")) System.out.println(playerNameOne+ " win!!");//grammar matters...
			else System.out.println(playerNameOne+ " wins!!");
		}
		else if(res==2) {
			System.out.println(weaponNameFromIndexCapitalized[PlayerTwoChoice]+" "+ winningMove[PlayerTwoChoice]+" "+  weaponNameFromIndex[PlayerOneChoice]+".");
			System.out.println(playerNameTwo+ " wins!!");
		}
		else {
			System.err.println("playRPS got -1 back from winnerIs("+PlayerOneChoice+","+PlayerTwoChoice+")");
			return -1;
		}
		System.out.println("");
		return res;
	}
	
	/*
	 * playPvC, "Play Player vs Computer" lets the user select which weapon to play with.
	 * The method creates a computer player and lets this make a random (valid) choice,
	 * and plays the player and the computer against each other. 
	 * 
	 * It can be called with no argument, or with the argument being either the selected weapon 
	 * as an int (0-2) or as a String ("0"-"2").
	 * When it's called without arguments, it gets a valid choice from the user by
	 * calling getPlayersValidWeapon(),
	 */
	public int playPvC(){
		return playPvC(getPlayersValidWeapon());
	}
	public int playPvC(String playersWeaponStr){
		int playersWeaponInt=weaponStringToInt(playersWeaponStr);
		if (playersWeaponInt<0 || playersWeaponInt>2) return -1;
		return playPvC(playersWeaponInt);
	}
	public int playPvC(int preselectedPlayersChoice) {
		int playerChoice=preselectedPlayersChoice;
		if (preselectedPlayersChoice<0 || preselectedPlayersChoice>2) return -1;
		System.out.println("You have chosen "+weaponNameFromIndex[playerChoice ]+"."); 
		
		ComputerPlayer oneCompPlayer =new ComputerPlayer();
		int computersChoice=oneCompPlayer.generateChoice();
		System.out.println("Computer has chosen "+weaponNameFromIndex[computersChoice]+".");
		
		return playRPS(playerChoice,computersChoice, "You", "Computer");
	}
	
	/*
	 * playCvC , "Play Computer vs Computer", creates two computer players
	 * lets each computer player generate a random but valid choice
	 * and plays them against eachother.
	 */
	public int playCvC() {
		ComputerPlayer oneCompPlayer =new ComputerPlayer();
		int PlayerOneChoice=oneCompPlayer.generateChoice();
		System.out.println("Computer_1 has chosen "+weaponNameFromIndex[PlayerOneChoice]+".");
		
		ComputerPlayer twoCompPlayer =new ComputerPlayer();
		int PlayerTwoChoice=twoCompPlayer.generateChoice();
		System.out.println("Computer_2 has chosen "+weaponNameFromIndex[PlayerTwoChoice]+".");
		
		return playRPS(PlayerOneChoice,PlayerTwoChoice, "Computer_1", "Computer_2");
	}
	
	/*
	 * winnerIs returns 1 if winner is PlayerOne
	 *                  2 if winner is PlayerTwo
	 *                  0 if it is a tie, i e both inputs are valid and the same.
	 *  The only valid inputs are 0, 1, and 2, and if either input is invalid, winnerIs returns -1 .
	 *  
	 *  The algorithm is easily extendable to Rock-Paper-Scissors-Lizard-Spock by
	 *  extending the winning range for player1 to resultNum==1 OR 2, and designating the values
	 *  0=Rock 1=Spock 2=paper 3=lizard 4=scissors, since each weapon beats its 2 next lower,
	 *  counting in mod 5.
	 */
	private int winnerIs(int WeaponOne, int WeaponTwo) {
		if(WeaponOne<0 || WeaponOne>2 || WeaponTwo<0 || WeaponTwo>2) return-1;
		int resultNum=(3+WeaponOne-WeaponTwo)%3;
		int winningPlayerIsNum=resultNum;
		return winningPlayerIsNum;
	}
	
	private int getPlayersValidWeapon(){
		int weaponOfChoiceInt=-1;
		String weaponOfChoiceStr="";
		System.out.println("You chose to play! Choose your weapon! :");
		do{
			System.out.println("0)Rock 1)Paper 2)Scissors");
			weaponOfChoiceStr=in.nextLine(); 
			weaponOfChoiceInt= weaponStringToInt(weaponOfChoiceStr);
		}while(!(weaponOfChoiceInt==ROCK || weaponOfChoiceInt==PAPER || weaponOfChoiceInt==SCISSORS));
		return weaponOfChoiceInt;
	}

	/*
	 * weaponStringToInt can be extended so that more answers from the user are accepted
	 * E g the words themselves, with different combination of capitalization
	 */
	static int weaponStringToInt(String zeroOneTwo){
		if(zeroOneTwo.equals("0") ) return 0;
		else if(zeroOneTwo.equals("1") ) return 1;
		else if(zeroOneTwo.equals("2") ) return 2;
		else return -1 ;
	}
}
