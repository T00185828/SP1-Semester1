//Lab5Ex4.java
//Corey Dennison T00185828
/*This program asks the user the amount of units they have consumed in a day
 *and calculates their mobile phone charge depending on the units used using if 
 *else statements*/
 
 import java.util.Scanner;
 
 public class Lab5Ex4{
 	public static void main(String args[]){
 		
 		//Create variable for units and for rate
 		int units;
 		double cost;
 		
 		Scanner input = new Scanner(System.in);
 		
 		System.out.print("Please enter the units used: ");
 		units = input.nextInt();
 		
 		if(units <= 99)
 			cost = units*0.05f;		
 		
 		else if(units <= 299)
 			cost = 99*0.05f + (units-99)*0.03f;
 		
	 	else if(units <=399)
	 		cost = 99*0.05f + 200*0.03f + (units-299)*0.02f;
	 	
	 	else
	 		cost = 99*0.05f + 200*0.03f + 100*0.02f + (units-399)*0.01f;
	 	
	 	System.out.println("The cost of your mobile phone bill is EUR" + String.format("%.2f",cost));
 		
 		
 	}
 }