import java.util.Scanner;

// Will Kinney & Tommy Liu
// 1/25
// Implement this program to play the game of “guess the number”
// If the player’s is incorrect, your program should loop until 
// the player finally gets the number right. Your program should 
// keep telling the player Too high or Too low to help the player 
// “zero in” on the correct answer. After a game ends, the program 
// should report the number of games the player played and prompt 
// the user to enter “y” to play again or “n” to exit the game.



public class GuessNum9 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		boolean play = true;
		int count = 0;
		
		int rand = (int)(Math.random()*(100-1) + 1);
		System.out.println(rand);
		
		System.out.println("I am thinking of a number 1 through 100. \n Can you guess my number?");

		while(play){
			count++;
			int guess = sc.nextInt();
			if(guess > rand) System.out.println("Too high. Try again");
			if(guess < rand) System.out.println("Too low. Try again");
			if(guess == rand){ 
				System.out.println("Excellent! You guessed the number! You guessed in " + count + " tries");
				System.out.println("Would you like to play again (y/n)?");
				String response = sc.next();
				if(response.equals("y")){
					count = 0;
					rand = (int)(Math.random()*(100-1) + 1);
					System.out.println(rand);
					System.out.println("I am thinking of a number 1 through 100. \n Can you guess my number?");
				}
				if(response.equals("n")) play = false;
				}
			}
		}
	}
