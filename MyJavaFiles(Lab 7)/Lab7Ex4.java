//Lab7Ex4
//Corey Dennison T00185828  
/*This program ask the user to enter a username and password. if these are not correct, the user
 *is given 3 attempts to enter the correctts ones. If they have failed 3 time, the program exits*/

import java.util.Scanner;

public class Lab7Ex4 {
    public static void main(String args[]) {
        
		String username, password;
		int attempts = 0;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter your username: ");
        username = input.nextLine();
        
        System.out.print("Please enter your password: ");
        password = input.nextLine();
        
        if(username.equals("t0012345") && password.equals("java")){
        	System.out.println("\nLogin successful. Welcome!");
        }
        
        else{
        	while(attempts<3){
        		System.out.println("\nInvalid username / password.");
        		
		        System.out.print("Please enter your username again: ");
		        username = input.nextLine();
        
		        System.out.print("Please enter your password again: ");
		        password = input.nextLine();
		        
		        if(username.equals("t0012345") && password.equals("java")){
		        	System.out.println("\nLogin successful. Welcome!");
		        	break;
		        }		        
        		attempts++;
        	}
        	
        if(attempts>=3){
			System.out.println("\nYou are banned due to too many failed attemps. Exiting.");
		 }
        }

        
    }
}
