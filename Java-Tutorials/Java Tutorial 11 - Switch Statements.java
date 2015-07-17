/* YouTube Link: https://www.youtube.com/watch?v=8h0LPmJ7ggA */

public class SwitchStatements {

	public static void main(String[] args) {
	
		int letterPos = 36;
		String letter = "";
		
		switch(letterPos){
		
			case 1:
				letter = "a";
				break;
			case 2:
				letter = "b";
				break;
			case 3:
				letter = "c";
				break;
			default:
				letter = "Invalid Letter Position";
				break;
		
		}
		
		System.out.println(letter);
		
		
	}

}
