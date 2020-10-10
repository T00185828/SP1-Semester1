//Lab2Ex3
//Corey Dennison T00185828
/*This program asks the user to input information on themselves and
 *uses the Scanner object to save these inputs to display them later*/
 
 import java.util.Scanner;
 
 public class Lab2Ex3 {
 	public static void main(String[] args){
 		
 		Scanner s = new Scanner(System.in);
 		
 		String name, address;
 		int weight, height;
 		
 		System.out.print("Please enter your name: ");
 		name = s.nextLine();
 		
 		System.out.print("Please enter your weight: ");
 		weight = s.nextInt();
 		
 		System.out.print("Please enter your height: ");
 		height = s.nextInt();
 		address = s.nextLine();
 		
 		System.out.print("Please enter your address: ");
 		address = s.nextLine();
 		
 		System.out.println("\nWhat you entered was... \n********************************\n" +
 			"Name: " + name + "\nWeight: " + weight + "\nHeight: " + height + "\nAddress: " + 
 				address);
 		
 	}
 }