//Lab5Ex1.java
//Corey Dennison T00185828
/*This program uses if/else statements to determine whether a user's
 *age is above or below 20 and display the outcome*/
 
 import java.util.Scanner;
 
public class Lab5Ex1 {
	public static void main(String[] args){
		
		int age;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your age: ");
		age = input.nextInt();
		
		if(age < 20){
			System.out.println("\nYou are under 20 years of age");
		}
		else{
			System.out.println("\nYou are atleast 20 years of age");	
		}		
	}
}