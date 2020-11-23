//Lab6Ex4
//Corey Dennison T00185828	
/*This program prompts the user to enter a month between 1 and 12 and using a switch statement
 *informs the user the number of days in the chosen month*/
 
 import java.util.Scanner;
 
 public class Lab6Ex4 {
 	public static void main(String args[]){
 		
 		int monthNumber;
 		
 		Scanner input = new Scanner(System.in);
 		
		System.out.print("Please enter the Month Number (1 - 12): ");
		monthNumber = input.nextInt();
		
		switch(monthNumber)
		{
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("\nNumber of days in month number " + monthNumber+ " is 30.");
				break;
			
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("\nNumber of days in month number " + monthNumber+ " is 31.");
				break;
			
			case 2:
				System.out.println("\nNumber of days in month number " + monthNumber+ " is 28.");
				break;	
			
			default:
				System.out.println("\nYou have not entered a valid month number between 1 and 12. Closing program...");
				break;
		}
 	}
 }