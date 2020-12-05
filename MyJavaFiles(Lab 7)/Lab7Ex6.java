//Lab7Ex6
//Corey Dennison T00185828  
/*This program prompts the user to enter some text. Using a while loop to interate through
 *each character, it is determined weather the user entered a positive whole number or not*/

import java.util.Scanner;

public class Lab7Ex6 {
    public static void main(String args[]) {
        
		String text;
		char character;
		int count=0, index=0;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter some text: ");
        text = input.nextLine();
        
        while(index < text.length()){
        	
        	//As the variable 'index' increments (index + 1) the next character of the input is read
        	character=text.charAt(index);
        	
        	//if the character is a whole number, increment count and index
        	if(character >= '0' && character <= '9'){
        		count++;
        		index++;
        	}
        	//if the character is not a whole number, break out of the loop
        	else
        		break;
        }
		
        if(count != text.length())
        	System.out.println("You have not entered a positive whole number");
        
        else
        	System.out.println("You have entered a positive whole number");
    }
}
