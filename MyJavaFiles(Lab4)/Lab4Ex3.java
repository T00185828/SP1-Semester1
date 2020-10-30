//Lab4Ex3.java
//Corey Dennison T00185828
/*This program calculates the volume of a cylinder
 *based on measurements provided by the user*/
 
 import java.util.Scanner;
 	
 public class Lab4Ex3 {
        
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float radius, height;
		final float PI = 3.142f;
		
		System.out.print("Enter radius of the cylinder: ");
		radius = input.nextFloat();
		
		System.out.print("Enter height of the cylinder: ");
		height = input.nextFloat();
		
		System.out.print("\nRadius of cylinder: " + radius + "\nHeight of cylinder: " + height + 
			"\n\nVolume of cylinder is: " + String.format("%.2f",(PI*(radius*radius)*height)) + " metres squared");
		
        
    }
}