//Lab8Ex4
//Corey Dennison T00185828
/*This program prompts the user to enter some text and evaluates using a for loop
 *if the input is a binary number or not*/
 
 import java.util.Scanner;
 
 public class Lab8Ex4 {
 	public static void main(String args[]){
 		
 		String text;
 		int index=0;
 		
 		Scanner input = new Scanner(System.in);
 		
 		System.out.print("Enter some text: ");
 		text = input.nextLine();
 		
 		for(int i=0; i<text.length(); i++){
 			
 			if(text.charAt(index)=='0' || text.charAt(index)=='1')
 				index++;
 				
 			else{
 				System.out.println("\nYou did not enter a binary number");
 				System.exit(0);
 			}
 		}
 		
 		
 		System.out.println("\nYou entered a binary number");
	
 	  }
 	}
 