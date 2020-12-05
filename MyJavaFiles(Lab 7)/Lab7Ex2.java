//Lab7Ex2.java
//Corey Dennison T00185828
/*This program prompts the user to enter a sentence ending in a full stop and using a while loop and incrementors 
 *informs the user the number of lower and uppercase letters, digits and punctuation was used in the sentence. When a
 *'.'. '?' or '!' is read in the sentence, the loop terminates*/

import java.util.Scanner;

public class Lab7Ex2 {
	public static void main(String args[]) {
		
		String sentence;
 		char ch;
 		int index = 0, lowerCase = 0, upperCase = 0, digits = 0, punctuation = 0;
 
 		Scanner input = new Scanner(System.in);
 		
 		System.out.print("Enter a sentence terminated with a . ! or ?: ");
 		sentence = input.nextLine();
 		ch = sentence.charAt(index);
 		
 		while(ch != '.' && ch != '?' && ch != '!')
 			{
 				if (ch >= 'a' && ch <= 'z')
 					lowerCase++;
 				else if (ch >= 'A' && ch <= 'Z')
 					upperCase++;
 				else if (ch >= '0' && ch <= '9')
 					digits++;
 				else
 					punctuation++;
				index++;
				ch = sentence.charAt(index); 
 			}
 			
 		System.out.println("\nThe Sentence you entered has: " + 
 			"\nNumber of lowercase letters  : " + lowerCase +
 				"\nNumber of uppercase letters  : " + upperCase +
 					"\nNumber of digits: " + digits +
 						"\nNumber of punctuation Symbols: " + (punctuation+1));
 	}
 }
