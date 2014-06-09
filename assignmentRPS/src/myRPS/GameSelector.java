/**
 * 
 */
package myRPS;
import java.util.Scanner;

/**
 * @author Lars Sjodahl
 */
public class GameSelector {


	public static void main(String[] args) {
		RockPaperScissors myRPSgame = new RockPaperScissors(); 
		String choice;
		boolean keepOnPlaying=false;
		if(args.length==0){
			keepOnPlaying=true;
			System.out.println("Play a game? Choose an option:");
		}
		Scanner in = new Scanner(System.in);
		do{
			choice="";
			if(args.length>0) choice=args[0];
			else{
				System.out.println("0)quit \n1)Player vs Computer \n2)Computer_1 vs Computer_2");
				choice=in.nextLine(); // using Strings makes it easier to extend the range of valid answers.	
			}
			if(choice.equals("0") ) {
				keepOnPlaying=false;
				System.out.println("Bye for this time!\n");
			}
			else if(choice.equals("1") ){
				if(args.length>1) myRPSgame.playPvC(args[1]);
				else {
					myRPSgame.playPvC();
					System.out.println("===================\nPlay another round? Choose an option:");
				}
			}
			else if(choice.equals("2") ){
				myRPSgame.playCvC();
				if(args.length==0) System.out.println("===================\nPlay another round? Choose an option:");
			}
			else {
				System.out.println("\nYou chose " + choice +" which is not an option.");
				System.out.println("It's good to think outside the box,");
				System.out.println("but in this case, you must choose 0, 1 or 2 .");
			}
		}while(keepOnPlaying);
		in.close();
		
	}//main
	

}
