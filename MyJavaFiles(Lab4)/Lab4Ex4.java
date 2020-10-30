//Lab4Ex4.java
//Corey Dennison T00185828
/*This program converts acres to hectares using String.format
 *and correct the result to 3 decimal places*/
 
 import java.util.Scanner;
 	
 public class Lab4Ex4 {
        
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float acres;
		
		System.out.print("Enter an area in acres: ");
		acres = input.nextFloat();
		
		System.out.println("\nThis is equivalent to " + String.format("%.3f",(acres*0.4046)) + " hectares");
		
    }
}