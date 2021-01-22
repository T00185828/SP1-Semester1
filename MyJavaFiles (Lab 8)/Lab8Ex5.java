//Lab8Ex5
//Corey Dennison T00185828
/*This program uses a for loop to calculates Fibonacci numbers (A number sequence created by adding the current number 
 *with the previous number repeatedly) up to 5000*/
 
 public class Lab8Ex5 {
 	public static void main(String args[]){
 		
 		int num1=1, num2=1, sum=0;
 		
 		System.out.println("The Fibonacci numbers < 5000 are: \n");
 		
 		for(int i=1; i<=100; i++){
 			
 			System.out.print(num1 + ", ");
			
			sum=num1+num2;
			num1=num2;
 			num2=sum;
 			
 			if(num1>5000)
 				break;
 			
 		}
	
 	  }
 	}
 