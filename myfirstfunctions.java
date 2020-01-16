import java.util.Scanner;
import java.util.Random;

public class myfirstfunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] rpsOptions = new String[3];// creates allocated memory 
		rpsOptions[0] = "rock";
		rpsOptions[1] = "paper";
		rpsOptions[2] = "scissors";
//		System.out.println(rpsOptions[0]); //checks to make sure array elements exist
//		System.out.println(rpsOptions[1]); //checks to make sure array elements exist
//		System.out.println(rpsOptions[2]); //checks to make sure array elements exist
		
		//instance created for the  bot that i will playing against.
		
		
		Scanner scan = new Scanner(System. in); 
		System.out.println("Enter your Option: ");
		String playerOne = scan.next();
		//instance created for the  bot that i will playing against.
		Random rand = new Random();
		String cpu = rpsOptions[rand.nextInt(3)];//generates a number betweeen 0-2 which are used to access rpsOptions array  
		System.out.println(cpu);
		
		if(playerOne.equals(rpsOptions[0]) && cpu == rpsOptions[2]) {
			System.out.println("Player One Wins The Game");
		}else if(playerOne.equals(rpsOptions[1]) && cpu == rpsOptions[0]) {
			System.out.println("player one wins the game");
		}else if(playerOne.equals(rpsOptions[2]) && cpu == rpsOptions[1]) {
			System.out.println("Player one wins the game");
		}else if(cpu == rpsOptions[0] && playerOne.equals(rpsOptions[2])) {
			System.out.println("cpu wins the game");
		}else if(cpu == rpsOptions[1] && playerOne.equals(rpsOptions[0])) {
			System.out.println("cpu wins the game ");
		}else if(cpu == rpsOptions[2] && playerOne.equals(rpsOptions[1])) {
			System.out.println("cpu wins the game");
		}else if(playerOne.equals(cpu)) {
			System.out.println("game results in a tie");
		}
		
		
		
		
		
		
		
		

	}
	
}
