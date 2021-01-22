//Lab8Ex6
//Corey Dennison T00185828
/*This program prompts the user to enter the number of asterisks they would like and uses a for loop to
 *display the amount stated*/
 
 import java.util.Scanner;
 
 public class Lab8Ex6 {
 	public static void main(String args[]){
 		
 		int loop=0;
 		
 		Scanner input = new Scanner(System.in);
 		
 		System.out.print("Enter the numbers of asterisks you would like: ");
 		loop = input.nextInt();
 		
 		for(int i=1; i<=loop; i++){
 			System.out.print(" * ");
 		}
 			
 	}
	
}