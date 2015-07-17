/* YouTube Link: https://www.youtube.com/watch?v=os6hXNIr_tA */

import java.util.Scanner;

public class AverageNumber {

	public static void main(String[] args) {
		
		int numValues = 0;
		int total = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number of values you'd like to have averaged.");
		numValues = input.nextInt();
		
		for(int i = 0; i < numValues; i++){
			
			System.out.println("Please enter a number.");
			
			int num = input.nextInt();
			total += num;
		}
		
		double averageNum = (double)total/numValues;
		
		System.out.println("Average: " + averageNum);

	}

}
