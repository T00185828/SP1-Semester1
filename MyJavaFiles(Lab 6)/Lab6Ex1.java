//Lab6Ex1
//Corey Dennison T00185828
/*This program determines if the user is eligible of joining the Garda by asking
 *the user several criteria questions, and uses if/else statement to determine if
 *the user meets them*/
 
 import java.util.Scanner;
 
 public class Lab6Ex1 {
 	public static void main(String args[]){
 		
 		int age, weight;
 		float height;
 		char gender, criminalRecord, dPass, course10week;
 		
 		Scanner input = new Scanner(System.in);
 		
 		//Ask user criteria questions
 		System.out.print("Please enter your age: ");
 		age = input.nextInt();
 		
 		System.out.print("Please enter your height: ");
 		height = input.nextFloat();
 		
 		System.out.print("Please enter your weight: ");
 		weight = input.nextInt();
 		
 		System.out.print("Please enter your gender (m or f): ");
 		gender = input.next().charAt(0);
 		
 		System.out.print("Do you have a criminal record (y or n)?: ");
 		criminalRecord = input.next().charAt(0);
 		
 		System.out.print("Did you get at least a D in pass Irish in the Leaving Cert (y or n)?: ");
 		dPass = input.next().charAt(0);
 		
 		//If they haven't passed Irish, ask if they will take 10-week course`.
 		if(dPass == 'n'){
 			System.out.print("Do you commit to taking a 10 week Irish course on application (y or n)?: ");
 			course10week = input.next().charAt(0);
 			//If they're willing to take the course and gender is male, evaluate criteria
	 		if(gender=='m'){
	 			if(age>=18 && age<=35 && height>=1.86 && weight<100 && criminalRecord=='n' && course10week=='y'){
	 				System.out.println("\nYou made it!");
	 				System.exit(0);	
	 			}
		 			else {
		 				System.out.println("\nYou failed!");
		 				System.exit(0);
		 			}		
	 			}
	 		//If they're willing to take the course and gender is female, evaluate criteria	
	 		else if(gender=='f'){
	 			if(age>=18 && age<=35 && height>=1.6 && weight<100 && criminalRecord=='n' && course10week=='y'){
	 				System.out.println("\nYou made it!");
	 				System.exit(0);		
	 			  }
	 			
		 			else{
		 				System.out.println("\nYou failed!");
		 				System.exit(0);	
		 			}		
	 			} 
 		}
 		//If the user's gender is male, evaluate criteria
 		if(gender=='m'){
 			if(age>=18 && age<=35 && height>=1.86 && weight<100 && criminalRecord=='n' && dPass=='y')
 				System.out.println("\nYou made it!");
 			else
 				System.out.println("\nYou failed!");			
 		}
 		//If the user's gender is female, evaluate criteria
 		 else if(gender=='f'){
 			if(age>=18 && age<=35 && height>=1.6 && weight<100 && criminalRecord=='n' && dPass=='y')
 				System.out.println("\nYou made it!");
 			else
 				System.out.println("\nYou failed!");			
 		} 
 	}
 }