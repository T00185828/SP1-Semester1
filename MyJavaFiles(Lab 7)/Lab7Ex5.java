//Lab7Ex5
//Corey Dennison T00185828  
/*This program ask the user to enter a username and password. if these are not correct, the user
 *is given 3 attempts to enter the correctts ones. If they have failed 3 time, the program exits*/

import java.util.Scanner;

public class Lab7Ex5 {
    public static void main(String args[]) {
        
		float weight, totalWeight=0, atLeast80=0, heaviest=0, lightest=0;
        int people=5, count=0;

        Scanner input = new Scanner(System.in);

        while(count < people){
            System.out.print("Please enter the weight of person " + (count+1) + ": ");
            weight = input.nextFloat();

            if(weight >= 80)
                atLeast80++;
                
            if(count==0){
            	heaviest=weight;
            	lightest=weight;
            }
            
            else {
            	if(weight>heaviest)
            		heaviest=weight;
            	else if(weight<lightest)
            		lightest=weight;
            }
            
            totalWeight += weight;

            count++;
        }

        System.out.println("\nResults" + "\nAverage weight: " + String.format("%.2f", totalWeight/people) + 
        	"\nPercent of weights that were greater than 80Kg: " + String.format("%.2f",atLeast80/people*100) + "%" + 
        		"\nHeaviest weight: " + String.format("%.1f",heaviest) + "kg" +
        			"\nLightest weight: " + String.format("%.1f",lightest) + "kg");
    }
}
