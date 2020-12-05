//Lab7Ex10
//Corey Dennison T00185828  
/*This program prompts the user to enter an interest rate for their account balance (€1000). Usind a do while loop
 *their annual balance is calculated using the interest rate and displayed until their balance is greater than €2000*/

import java.util.Scanner;

public class Lab7Ex10 {
    public static void main(String args[]) {
    	
			float rate, balance=1000;
			int year=1;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the rate of interest: ");
			rate=input.nextFloat();
			
			System.out.println("\n\n");
			
			do {
				balance+=(balance*rate)/100;
				System.out.println("Balance - end Year "+year+" Eur"+String.format("%.2f",balance));
				year++;
			} while(balance<2000);							
    }
}
