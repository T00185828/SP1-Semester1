//Lab6Ex3
//Corey Dennison T00185828	
/*This program prompts the user to choose one of 3 choices, uses a switch statement 
 *to calculate the are of a circle, the volume of a sphere, or exiting the program 
 *based on their choice*/
 
 import java.util.Scanner;
 
 public class Lab6Ex3 {
 	public static void main(String args[]){
 		
 		int choice;
 		double radius;
 		final double PI = 3.142f;
 		
 		Scanner input = new Scanner(System.in);
 		
 		System.out.println("Please pick from one of the choices below: " +
 			"\n1. Calculate the area of a circle." +
 			"\n2. Calculate the volume of a sphere." + 
 			"\n3. Quit");
 		choice = input.nextInt();
 		
 		switch(choice)
 			{
	 			case 1:
	 				System.out.print("\n\nPlease enter the raduis of the circle: ");
	 				radius = input.nextDouble();
	 				
	 				System.out.println("\nThe area of the circle is " + String.format("%.3f",PI*(radius*radius)) +"cm^2");
	 				break;
 			
 			
	 			case 2:
	 				System.out.print("\n\nPlease enter the raduis of the sphere: ");
	 				radius = input.nextDouble();
	 				
	 				System.out.println("\nThe volume of the sphere is " + String.format("%.3f",1.333*PI*(radius*radius*radius)) + "cm^2");
	 				break;
	 				
	 			case 3:
	 				System.out.println("\nYou have choosen to exit the program. Goodbye!");
	 				break;
	 			
	 			default:
	 				System.out.println("\nYou have not choosen 1, 2 or 3. Exiting program...");
	 				break;
 		} 
 	}
 }