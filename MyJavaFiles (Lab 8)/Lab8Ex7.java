//Lab8Ex7
//Corey Dennison T00185828
/*This program prompts the user for the number of words they want in a pyramid and
 *outputs the rows using a for loop*/
 
 import java.util.Scanner;
 
 public class Lab8Ex7 {
 	public static void main(String args[]){
 		
 		int rows=0, sum=0;
 		
 		Scanner input = new Scanner(System.in);
 		
 		System.out.print("Enter the number of rows you want: ");
 		rows = input.nextInt();
 		
 		//for loop loops number of rows times
		for(int i=1; i<=rows; i++){
			for(int j=0; j<i; j++)
					System.out.print(rows + " ");
					
				System.out.println();
			}
		 
		
	/*	int rows;
		Scanner input=new Scanner(System.in);
		System.out.print("How many rows in the Pyramid? ");
		rows=input.nextInt();
		
		for(int i=1; i<=rows; i++){
			for(int j=0; j<i; j++)
				System.out.print(" * ");
			System.out.println();
		}*/
		
 	  }
 	}