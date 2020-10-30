//Lab4Ex6.java
//Corey Dennison T00185828
/*This program calculates gravitational force exerted on one object
 *by another using measurement provided by the user*/
 
 import java.util.Scanner;
 	
 public class Lab4Ex6 {
        
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float mass1, mass2;
		int distance;
		
		final float G = 6.67300E-11f;
		
		System.out.print("Enter the mass in kg of the first object: ");
		mass1 = input.nextFloat();
		
		System.out.print("Enter the mass in kg of the second object: ");
		mass2 = input.nextFloat();
		
		System.out.print("Enter the distance (metres) between them: ");
		distance = input.nextInt();
		
		System.out.println("\n\n*****Results of Program*****\n");
		
		System.out.println("The mass of the first object is " + mass1 + "kg");
		System.out.println("The mass of the second object is " + mass2 + "kg");
		System.out.println("The distance between the two objects is " + distance + "m\n");
		
		System.out.println("The force exerted on the objects is " + String.format("%.2f",(G*(mass1*mass2)/(distance*distance))) + "N");
		
	}
 }