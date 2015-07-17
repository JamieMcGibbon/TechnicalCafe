/* YouTube Link: https://www.youtube.com/watch?v=K62bBI2FH5k */

public class ConditionalStatements {

	public static void main(String[] args) {

		int myGuess = 102;
		
		if(myGuess == 1){
			System.out.println("Sorry, wrong number!");
		}
		else if(myGuess == 2){
			System.out.println("Sorry, 2 is not right either!");
		}
		else if(myGuess == 3){
			System.out.println("You guessed the right number!");
		}
		else if(myGuess == 4){
			System.out.println("You guessed the wrong number!");
		}
		else{
			System.out.println("Sorry, still have the wrong number!");
		}
		
	}

}
