//ifElseGroup.java
//Corey Dennison T00185828
//This project asks to user to enter their electrical usage in kWh for
//the past two months and calculates their bill

import java.util.Scanner;

public class ifElseGroup {
	public static void main (String args[]){
		
		int usage;
		double total;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your electrical usage over the last 2 months in kWh: ");
		usage = input.nextInt();
		
		if(usage<=240){
			total = usage*0.14;
		}
			else if(usage <= 540){
				total = (240*0.14) + ((usage-240)*0.13);
			}
				else {
					total = (240*0.14)+(300*0.13) +((usage-540)*0.11);
				}
				
		System.out.println("\nThe total amount of you bill is EUR" + String.format("%.2f",total));
		
		
		
	}
}