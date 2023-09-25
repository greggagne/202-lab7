/**
 * Plays Greedy Coin game such that the computer never loses.
 * 
 * [ YOUR NAME GOES HERE]
 */
import java.io.*;
import java.util.Scanner;

public class GreedyCoinGame {
	
	public GreedyCoinGame(String file) throws FileNotFoundException {
		Scanner inFile = new Scanner(new File(file));

		while (inFile.hasNext()) {
			System.out.println(inFile.nextInt());
			// TO-DO store each coin in an ArrayList
		}

		inFile.close();
	}

	// prints the coins and their position
	public void printCoins() {
		System.out.println("+++++++++++");
		
		// TO-DO print out each element and its position in the array list
		
		System.out.println("+++++++++++");
	}

	public void playGame() {
		System.out.println("Let's play the coin game!");
		printCoins();

		// get the keyboard for the silly human
		Scanner keyboard = new Scanner(System.in);
		
		// TO-DO Play the game using the Red Blue strategy
		
		System.out.println("Indicate the position of the coin you choose: ");
		int humanChoice = keyboard.nextInt();

		keyboard.close();

	}

	public static void main(String[] args) throws IOException {
		if (args.length != 1) {
			System.err.println("Provide a file on the command line");
			System.exit(0);
		}

		GreedyCoinGame game = new GreedyCoinGame(args[0]);

		game.playGame();
	}

}
