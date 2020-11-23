//Lab6Ex2
//Corey Dennison T00185828
/*This program asks the user to enter a single character and uses if/else statement to 
 *evaluate if the character is a uppercase or lowercase letter or a digit*/
 
 import java.util.Scanner;
 
 public class Lab6Ex2 {
 	public static void main(String args[]){
 		
 		char character;
 		
 		Scanner input = new Scanner(System.in);
 		
 		System.out.print("Please enter a single character: ");
 		character = input.next().charAt(0);
 		
 		if(character>='0' && character<='9')
 			System.out.println("\nThe character you entered is a digit.");
 		
	 		else if(character>='A' && character<='Z')
	 			System.out.println("\nThe character you entered is uppercase letter.");
 			
		 		else if(character>='a' && character<='z')
		 			System.out.println("\nThe character you entered is a lowercase letter.");
		 			
		 			else
		 				System.out.println("\nThe character you entered is neither a letter or digit");	
 	}
 }