package projects;

import java.util.Scanner;                               //For user input

public class ChangeMaker {

	
	public static void main(String[] args) {

		changeCounter();                                //Calling my change counter method
		
	}
	
	public static void changeCounter() { 
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter total change: ");       //Prompt for input of change amount
		int changeInPennies = in.nextInt();
		
		
		if (changeInPennies >= 25) {                    //Add this condition to only report quarters when there are some
			int quarters = changeInPennies / 25;        //Calculate the number of quarters 
			System.out.println(quarters+ " Quarters");  //Printing the results. Concatenating to add string to identify coin
			changeInPennies = changeInPennies % 25;     //Updating the remaining total change
		}
		
		if (changeInPennies >= 10) {                    //Chose IF statements since it's possible to have each coin denomination...
			int dimes = changeInPennies / 10;           //cont'd...for a given change amount
			System.out.println(dimes+ " Dimes");
			changeInPennies = changeInPennies % 10;
			
		}
		
		if (changeInPennies >= 5) {
			int nickels = changeInPennies / 5;
			System.out.println(nickels+ " Nickels");
			changeInPennies = changeInPennies %5;
			
		}
		
		if (changeInPennies >= 1) {
			int pennies = changeInPennies;
			System.out.println(pennies+ " Pennies");
		}
	
}

}