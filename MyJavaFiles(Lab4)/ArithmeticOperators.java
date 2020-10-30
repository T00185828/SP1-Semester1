//ArithmeticOperators.java
//Corey Dennison T00185828
/*This program uses common arithmetic operators
 *in java to process two number provided by the user*/
 
 import java.util.Scanner;
 
 public class ArithmeticOperators {
 	public static void main(String [] args) {
 		
 		Scanner input = new Scanner(System.in);
 		
 		float number1, number2;
 		
 		System.out.print("Enter the first number: ");
 		number1 = input.nextFloat();
 		
 		System.out.print("Enter the second number: ");
 		number2 = input.nextFloat();
 		
 		System.out.println("\n\t***** Arithmetic Operators*****\n"
 			 + number1 + " + " + number2 + " = " + String.format("%.1f",(number1 + number2)) + 
 			 	"\n" + number1 + " - " + number2 + " = " + String.format("%.1f",(number1 - number2)) + 
 			 	"\n" + number1 + " * " + number2 + " = " + String.format("%.1f",(number1 * number2)) +
 			 	"\n" + number1 + " / " + number2 + " = " + String.format("%.1f",(number1 / number2)) +
 			 	"\n" + number1 + " % " + number2 + " = " + String.format("%.1f",(number1 % number2)));
 	}
 }