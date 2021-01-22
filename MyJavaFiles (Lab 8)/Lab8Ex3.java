//Lab8Ex3
//Corey Dennison T00185828
/*This program prompt the user to enter the number they want to multipley in a 
 *multiplication table and uses a for loop to display the first 12 items in the table*/
 
 import java.util.Scanner;
 
 public class Lab8Ex3 {
 	public static void main(String args[]){
 		
 		int number=0, timesAmount=0;
 		
 		Scanner input = new Scanner(System.in);
 		
 		System.out.print("What multiplication table do you want?: ");
 		number = input.nextInt();
 		
 		System.out.println("\nThe table is: ");
 		
 		for(int i=0; i<=12; i++){
 			System.out.println(number + " * " + timesAmount + " = " + (number*timesAmount));
 			timesAmount++;	
 		}
 	}
 }