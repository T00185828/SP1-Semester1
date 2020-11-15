//Lab5Ex2.java
//Corey Dennison T00185828
/*This program asks the user to enter their gross monthly income, pension payment
 *cut-off point and tax-credits and using if/else statements calculates the PAYE owed.*/
 
 import java.util.Scanner;
 
public class Lab5Ex2 {
	public static void main(String[] args){
		
		int grossIncome, pension, cut_off, taxCredits;
		float PAYE;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your gross income: ");
		grossIncome = input.nextInt();
		
		System.out.print("Please enter your pension payment: ");
		pension = input.nextInt();
		
		System.out.print("Please enter your cut-off point: ");
		cut_off = input.nextInt();
		
		System.out.print("Please enter your tax-credits: ");
		taxCredits = input.nextInt();
		
		if(grossIncome > cut_off){
			PAYE = (((cut_off/100)*20) + ((grossIncome - cut_off - pension)/100*42) - taxCredits);
		}
		else {
			PAYE = ((grossIncome - pension)/100*20 - taxCredits);
		}
		
		System.out.println("\nThe PAYE due by this employee is EUR" + String.format("%.2f", PAYE));
	
	}
}