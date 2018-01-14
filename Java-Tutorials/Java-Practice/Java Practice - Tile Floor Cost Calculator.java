/* YouTube Link: https://www.youtube.com/watch?v=EjW4sgf7zto */

import java.util.Scanner;

public class TileCost {

	public static void main(String[] args) {
		
		double length, width, price, cost;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the floor's length");
		
		length = input.nextDouble();
		
		System.out.println("Please enter the floor's width");
		
		width = input.nextDouble();
		
		System.out.println("Please enter the price per sq. ft.");
		
		price = input.nextDouble();
		
		//calc cost of floor project
		cost = length * width * price;
		
		System.out.println("The price of the new floor will be $" + cost + ".");

	}

}
