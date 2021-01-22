//Lab8Ex2
//Corey Dennison T00185828
/*This program prompt the user to enter a upper limit of the amount of positive inters and 
 *displays the sum of the first 20 positive integers using a for loop*/
 
 import java.util.Scanner;
 
 public class Lab8Ex2 {
 	public static void main(String args[]){
 		
 		int positiveInteger = 1, sum=0, upperLimit=0;
 		
 		Scanner input = new Scanner(System.in);
 		
 		System.out.print("Enter the upper limit: ");
 		upperLimit = input.nextInt();
 		
 		for(int i=0; i<upperLimit; i++){
 			sum+=positiveInteger;
 			positiveInteger+=1;
 		}
 		
 		System.out.println("\nSum of the first " + upperLimit + " positive integers is " + sum);
 	}
 }

