//Lab5Ex3.java
//Corey Dennison T00185828
/*This program aks for a user's phone provider, their total number 
 *of calls in a month to the USA, Australia and Japan, and calculates
 *their bill depanding on their inputs using if/else statements*/
 
 import java.util.Scanner;
 
 public class Lab5Ex3{
 	public static void main(String args[]){
 		
 		Scanner input = new Scanner(System.in);
 		
 		char provider;
 		int totalCalls;
 		final int tMinutesUSA, tMinutesAUST, tMinutesJAP,vMinutesUSA, vMinutesAUST, vMinutesJAP;	
 		
 		System.out.print("Which service did you use for calls? T (TalkTell) or V (Vodafone): ");
 		provider = input.next().charAt(0);
 		
 		//If the user's provider is TalkTell, the below code will run
 		if(provider=='T'){
 			System.out.print("Please enter the total number of calls made in the month: ");
 			totalCalls = input.nextInt();
 			
 			/*If the user enters '0' when asked for their total calls for the month,
 			 *an error message will appear and the program will close.*/
	 		if(totalCalls==0){
	 			System.out.println("Thank you for your time... Goodbye");
	 			System.exit(0);
	 		}
	 		
	 		System.out.print("Please enter the number of minutes to the USA: ");
	 		tMinutesUSA = input.nextInt();
	 		
	 		System.out.print("Please enter the number of minutes to Australia: ");
	 		tMinutesAUST = input.nextInt();
	 		
	 		System.out.print("Please enter the number of minutes to Japan: ");
	 		tMinutesJAP = input.nextInt();
	 		
	 		//calculating total cost with TalkTell
 			System.out.println("Cost of TalkTell is EUR" + String.format("%.2f",(tMinutesUSA * 0.06)+(tMinutesAUST*0.08)+(tMinutesJAP*0.24)));
 			
 			//calculating average cost (total price divided by total calls made)
 			System.out.println("\nAverage cost is EUR" + String.format("%.2f",((tMinutesUSA * 0.06)+(tMinutesAUST*0.08)+(tMinutesJAP*0.24))/totalCalls));
 		}
 			
		//If the user's provider is Vodafone, the below code will run
 		else if(provider=='V'){
 			
 			System.out.print("Please enter the total number of calls made in the month: ");
 			totalCalls = input.nextInt();
 			
 			/*If the user enters '0' when asked for their total calls for the month,
 			 *an error message will appear and the program will close.*/
	 		if(totalCalls==0){
	 			System.out.println("Thank you for your time... Goodbye");
	 			System.exit(0);
	 		}
	 		
	 		System.out.print("Please enter the number of minutes to the USA: ");
	 		vMinutesUSA = input.nextInt();
	 		
	 		System.out.print("Please enter the number of minutes to Australia: ");
	 		vMinutesAUST = input.nextInt();
	 		
	 		System.out.print("Please enter the number of minutes to Japan: ");
	 		vMinutesJAP = input.nextInt();	
	 		
	 		//calculating total cost with Vodafone
 			System.out.println("Cost of Vodafone is EUR" + String.format("%.2f",(vMinutesUSA * 0.19)+(vMinutesAUST*0.85)+(vMinutesJAP*0.92)));
 			
 			//calculating average cost (total price divided by total calls made)
 			System.out.println("\nAverage cost is EUR" + String.format("%.2f",((vMinutesUSA * 0.19)+(vMinutesAUST*0.85)+(vMinutesJAP*0.92))/totalCalls));
 		}
 		
 		/*If the user did not enter 'T' or 'V' when asked for their provider
 		 *an error message will show and the program will close*/
 		else{
 			System.out.println("Incorrect choice - use T (TalkTell) or V (Vodafone)... Goodbye");
 			System.exit(0);
 		}
		
 	}
 } 
 	
 	
 		

