//Lab7Ex7
//Corey Dennison T00185828  
/*This program uses a loop that prompts the user to enter a negative interger. Once the loop
 *ends, the largest negative interger whose cubed value (using Math.pow) was less than -15,000 is displayed*/

import java.util.Scanner;

public class Lab7Ex7 {
    public static void main(String args[]) {
        
		int negativeInt=0, largest=0, count=0;

        Scanner input = new Scanner(System.in);
		
		//While the value of the interger cubed is greater than -15000, continue the loop
        while(Math.pow(negativeInt,3) >= -15000){
        	System.out.print("Please enter a negative interger: ");
        	negativeInt = input.nextInt();
        	//If the value of 'count' is 0 and the cubed value is greater than -15,000,
        	//the negative integer becomes the "largest"
        	if(count==0 && Math.pow(negativeInt,3) >= -15000)
        		largest=negativeInt;
        	//If the cubed value is less (higher) than the determined "largest" value 
        	//and is greater than -15000, the new value become the "largest"
        	else if (negativeInt < largest && Math.pow(negativeInt,3) >= -15000)
        		largest=negativeInt;
        		
        	count++;
        }
        
        System.out.println("Largest negative interger whose cubed value is less than -15,000 is " + largest);
    }
}
