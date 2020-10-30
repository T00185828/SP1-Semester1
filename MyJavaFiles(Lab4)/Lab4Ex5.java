//Lab4Ex5.java
//Corey Dennison T00185828
/*This program calculates the distance traveled by an object
 *using the equation "s = ut + 1/2 at^2" */
 
 import java.util.Scanner;
 	
 public class Lab4Ex5 {
        
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float u, t, a;
		
		System.out.print("Enter initial speed u: ");
		u = input.nextFloat();
		
		System.out.print("Enter acceleration a: ");
		a = input.nextFloat();
		
		System.out.print("Enter time spent traveling t: ");
		t = input.nextFloat();
		
		System.out.println("\nThe distance the object traveled is " + String.format("%.2f",((u*t)+((a*t)*(a*t)/2))) + " metres");
    }
}