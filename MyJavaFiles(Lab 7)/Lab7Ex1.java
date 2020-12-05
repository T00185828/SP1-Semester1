//Lab7Ex1
//Corey Dennison T00185828
/*This program prompts a user multiple times to enter a degrees in fahrenheit using a 
 *while loop. Once the loop is terminated, the degrees in fahrenheit is given in celcius,
 *the number of times the degrees s over 30 and below 10 and at least 20 */
 
 import java.util.Scanner;
 
 public class Lab7Ex1 {
 	public static void main(String args[]){
 		
 		int totalConversions=0,over30=0, below10=0;
 		float fahrenheit=0, /*Made atLeast20 a float as ran into errors while it was an int and was divided by totalConversions, with the result being a decimal*/atLeast20=0;
 		double celcius=0, totalCels=0;
 		
 		Scanner input = new Scanner(System.in);
 		
 		System.out.print("Please enter a degrees in Fahrenheit(enter a number less than -459 to stop): ");
 		fahrenheit = input.nextFloat();
			
		while(fahrenheit > -459.67){
			
			celcius = /*5/9 fails to work(celcius always equates to 0), so using raw value (Now know to resolve this issue is typing "5/9f")*/0.55555556*(fahrenheit-32);
 		
 			System.out.println(fahrenheit + " Fahrenheit is " + String.format("%.3f",celcius) + " Celcius.");
			
			totalConversions++;
			totalCels += celcius;
 			
 			if(celcius>30)
 				over30++;
 			
 			else if(celcius<10)
 				below10++;
 			
 			if(celcius>=20)
 				atLeast20++;
 			
 			System.out.print("\nPlease enter another degrees in Fahrenheit(enter a number less than -459 to stop): ");
 			fahrenheit = input.nextFloat();	
		}
		
		if(totalConversions!=0){
			System.out.println("\nTotal amount of conversions is " + totalConversions +
				"\nThe average temperature of Celcius temperatures is " + String.format("%.0f",totalCels/totalConversions) + "C" +
					"\nThe number of Celcius temperatures that exceeded 30C is " + over30 + 
						"\nThe number of Celcius temperatures that were below 10C is " + below10 + 
							"\nThe percentage of Celcius temperatures that were at least 20^C is " + String.format("%.0f",atLeast20/totalConversions*100) + "%");
						}
		else{
	System.out.println("No conversions were performed... Goodbye.");
			System.exit(0);	
		}
 	}
 }