//Lab8Ex1
//Corey Dennison T00185828
/*This program displays the sum of the first 20 positive integers 
 *using a for loop*/
 
 public class Lab8Ex1 {
 	public static void main(String args[]){
 		
 		int positiveInteger = 1, sum=0;
 		
 		
 		for(int i=0; i<20; i++){
 			sum+=positiveInteger;
 			positiveInteger+=1;
 		}
 		
 		System.out.println("Sum of the first 20 positive integers is " + sum);
 	}
 }

