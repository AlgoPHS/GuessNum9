import java.util.Scanner;

public class GuessNum9 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int rand = (int)(Math.random()*(100-1) + 1);
		System.out.println(rand);
		
		System.out.println("I am thinking of a number 1 through 100. \n Can you guess my number?");
		
		for(int i = 0; i < 4; i++){
			int guess = sc.nextInt();
			if(guess > rand) System.out.println("Too high. Try again");
			if(guess < rand) System.out.println("Too low. Try again");
			if(guess == rand){ 
				System.out.println("Excellent! You guessed the number! You guessed in " + i + " tries");
				System.out.println("Would you like to play again (y/n)?");
				String response = sc.next();
				if(response.equals("y")){
					i = 0;
					rand = (int)(Math.random()*(100-1) + 1);
					System.out.println(rand);
				if(response.equals("n")) break;
				}
			}
		}
	}
}
